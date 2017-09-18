package org.com.zjut.ie.ck.util.status;

public enum HttpStatus {
	TEST_EXCEPTION(100, "≤‚ ‘“Ï≥£");
	
    private final int value;

    private final String reasonPhrase;

    private HttpStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    /**
     * Return the integer value of this status code.
     */
    public int value() {
        return this.value;
    }

    /**
     * Return the reason phrase of this status code.
     */
    public String getReasonPhrase() {
        return reasonPhrase;
    }
}
