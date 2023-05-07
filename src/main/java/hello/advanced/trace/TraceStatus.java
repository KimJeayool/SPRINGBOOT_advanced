package hello.advanced.trace;

/**
 * 로그의 상태 정보를 가진다.
 * */
public class TraceStatus {

    private TraceId traceId;  // 트랜잭션 ID와 Level 정보
    private Long startTimeMs; // 로그 시작 시간
    private String message;   // 메세지

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
