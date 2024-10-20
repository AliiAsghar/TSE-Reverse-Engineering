package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwo extends Exception {
    static final alnr a;
    public final int b;

    static {
        alnp alnpVar = new alnp();
        alnpVar.c("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        alnpVar.c("ERROR_CODE_IO_UNSPECIFIED", 2000);
        alnpVar.c("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        alnpVar.c("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        alnpVar.c("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        alnpVar.c("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        alnpVar.c("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        alnpVar.c("ERROR_CODE_IO_NO_PERMISSION", 2006);
        alnpVar.c("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        alnpVar.c("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        alnpVar.c("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        alnpVar.c("ERROR_CODE_DECODING_FAILED", 3002);
        alnpVar.c("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        alnpVar.c("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        alnpVar.c("ERROR_CODE_ENCODING_FAILED", 4002);
        alnpVar.c("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        alnpVar.c("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        alnpVar.c("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        alnpVar.c("ERROR_CODE_MUXING_FAILED", 7001);
        alnpVar.c("ERROR_CODE_MUXING_TIMEOUT", 7002);
        alnpVar.c("ERROR_CODE_MUXING_APPEND", 7003);
        a = alnpVar.b();
    }

    public fwo(String str, Throwable th, int i) {
        this(str, th, i, null);
    }

    public static fwo a(esq esqVar, String str) {
        return new fwo("Audio error: " + str + ", audioFormat=" + String.valueOf(esqVar.a), esqVar, 6001);
    }

    public static fwo b(Throwable th, int i, fwn fwnVar) {
        return new fwo("Codec exception: ".concat(fwnVar.toString()), th, i, null);
    }

    private fwo(String str, Throwable th, int i, byte[] bArr) {
        super(str, th);
        this.b = i;
        SystemClock.elapsedRealtime();
    }
}
