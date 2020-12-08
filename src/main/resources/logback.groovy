import ch.qos.logback.classic.encoder.PatternLayoutEncoder

scan("5 seconds")

/* 테스트 용 logback */
def HOST_NAME = hostname
def THREAD_PATTERN = "[${HOST_NAME}-%thread]"
def DEFAULT_PATTERN = "%date{'yyyy-MM-dd HH:mm:ss,SSS Z'} [${THREAD_PATTERN}] %-5level %logger{10} %msg%n%rEx"


appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        Pattern = "${DEFAULT_PATTERN}"
    }
}

root(DEBUG, ["CONSOLE"])