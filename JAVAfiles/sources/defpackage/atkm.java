package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkm {
    public int a;
    public Object b;
    public Object c;

    public atkm() {
    }

    public final Conversation a() {
        Object obj;
        Object obj2;
        int i = this.a;
        if (i != 0 && (obj = this.c) != null && (obj2 = this.b) != null) {
            return new AutoValue_Conversation(i, (RcsDestinationId) obj, (String) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" destination");
        }
        if (this.b == null) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId != null) {
            this.c = rcsDestinationId;
            return;
        }
        throw new NullPointerException("Null destination");
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void d(int i) {
        if (i != 0) {
            this.a = i;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final ahim e() {
        String str;
        int i = this.a;
        if (i != 0) {
            if (this.c == null) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 201) {
                                switch (i) {
                                    case 101:
                                        str = "ANDROID_DOWNLOADER_UNKNOWN";
                                        break;
                                    case 102:
                                        str = "ANDROID_DOWNLOADER_CANCELED";
                                        break;
                                    case 103:
                                        str = "ANDROID_DOWNLOADER_INVALID_REQUEST";
                                        break;
                                    case 104:
                                        str = "ANDROID_DOWNLOADER_HTTP_ERROR";
                                        break;
                                    case 105:
                                        str = "ANDROID_DOWNLOADER_REQUEST_ERROR";
                                        break;
                                    case 106:
                                        str = "ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR";
                                        break;
                                    case 107:
                                        str = "ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR";
                                        break;
                                    case 108:
                                        str = "ANDROID_DOWNLOADER_NETWORK_IO_ERROR";
                                        break;
                                    case 109:
                                        str = "ANDROID_DOWNLOADER_DISK_IO_ERROR";
                                        break;
                                    case 110:
                                        str = "ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR";
                                        break;
                                    case 111:
                                        str = "ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR";
                                        break;
                                    case 112:
                                        str = "ANDROID_DOWNLOADER_OAUTH_ERROR";
                                        break;
                                    default:
                                        switch (i) {
                                            case 301:
                                                str = "GROUP_NOT_FOUND_ERROR";
                                                break;
                                            case 302:
                                                str = "DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR";
                                                break;
                                            case 303:
                                                str = "INSECURE_URL_ERROR";
                                                break;
                                            case 304:
                                                str = "LOW_DISK_ERROR";
                                                break;
                                            case 305:
                                                str = "UNABLE_TO_CREATE_FILE_URI_ERROR";
                                                break;
                                            case 306:
                                                str = "SHARED_FILE_NOT_FOUND_ERROR";
                                                break;
                                            case 307:
                                                str = "MALFORMED_FILE_URI_ERROR";
                                                break;
                                            case 308:
                                                str = "UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR";
                                                break;
                                            case 309:
                                                str = "UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR";
                                                break;
                                            case 310:
                                                str = "DOWNLOADED_FILE_NOT_FOUND_ERROR";
                                                break;
                                            case 311:
                                                str = "DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR";
                                                break;
                                            case 312:
                                                str = "UNABLE_TO_SERIALIZE_DOWNLOAD_TRANSFORM_ERROR";
                                                break;
                                            case 313:
                                                str = "DOWNLOAD_TRANSFORM_IO_ERROR";
                                                break;
                                            case 314:
                                                str = "FINAL_FILE_CHECKSUM_MISMATCH_ERROR";
                                                break;
                                            case 315:
                                                str = "DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR";
                                                break;
                                            case 316:
                                                str = "DELTA_DOWNLOAD_DECODE_IO_ERROR";
                                                break;
                                            case 317:
                                                str = "UNABLE_TO_UPDATE_FILE_STATE_ERROR";
                                                break;
                                            case 318:
                                                str = "UNABLE_TO_UPDATE_GROUP_METADATA_ERROR";
                                                break;
                                            case 319:
                                                str = "UNABLE_TO_UPDATE_FILE_MAX_EXPIRATION_DATE";
                                                break;
                                            case 320:
                                                str = "UNABLE_SHARE_FILE_BEFORE_DOWNLOAD_ERROR";
                                                break;
                                            case 321:
                                                str = "UNABLE_SHARE_FILE_AFTER_DOWNLOAD_ERROR";
                                                break;
                                            case 322:
                                                str = "UNABLE_TO_REMOVE_SYMLINK_STRUCTURE";
                                                break;
                                            case 323:
                                                str = "UNABLE_TO_CREATE_SYMLINK_STRUCTURE";
                                                break;
                                            case 324:
                                                str = "UNABLE_TO_RESERVE_FILE_ENTRY";
                                                break;
                                            case 325:
                                                str = "INVALID_INLINE_FILE_URL_SCHEME";
                                                break;
                                            case 326:
                                                str = "MALFORMED_DOWNLOAD_URL";
                                                break;
                                            case 327:
                                                str = "UNSUPPORTED_DOWNLOAD_URL_SCHEME";
                                                break;
                                            case 328:
                                                str = "INLINE_FILE_IO_ERROR";
                                                break;
                                            case 329:
                                                str = "MISSING_INLINE_DOWNLOAD_PARAMS";
                                                break;
                                            case 330:
                                                str = "MISSING_INLINE_FILE_SOURCE";
                                                break;
                                            case 331:
                                                str = "CUSTOM_FILEGROUP_VALIDATION_FAILED";
                                                break;
                                            case 332:
                                                str = "DUPLICATE_REQUEST_ERROR";
                                                break;
                                            default:
                                                str = "null";
                                                break;
                                        }
                                }
                            } else {
                                str = "ANDROID_DOWNLOADER2_ERROR";
                            }
                        } else {
                            str = "UNKNOWN_ERROR";
                        }
                    } else {
                        str = "SUCCESS";
                    }
                } else {
                    str = "UNSPECIFIED";
                }
                this.c = "Download result code: ".concat(str);
            }
            return new ahim(this);
        }
        throw null;
    }

    public final amkn f() {
        aozy createBuilder = amkn.a.createBuilder();
        int i = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amkn amknVar = (amkn) createBuilder.b;
        int i2 = i - 1;
        if (i != 0) {
            amknVar.d = i2;
            amknVar.b |= 2;
            ((Optional) this.c).ifPresent(new leq(createBuilder, 20));
            ((Optional) this.b).ifPresent(new met(createBuilder, 1));
            return (amkn) createBuilder.s();
        }
        throw null;
    }

    public final void g(String str) {
        this.b = Optional.of(str);
    }

    public atkm(byte[] bArr, byte[] bArr2) {
        this.b = null;
        this.a = 0;
        this.c = null;
    }

    public atkm(Context context, faa faaVar) {
        albo.D(new ezp(context, 1));
        this.c = faaVar;
        int i = ezf.a;
    }

    public atkm(char[] cArr, byte[] bArr) {
        this.b = Optional.empty();
        this.a = 1;
        this.c = Optional.empty();
    }
}
