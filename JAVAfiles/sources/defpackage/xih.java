package defpackage;

import android.database.Cursor;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Size;
import j$.time.Duration;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xih extends arrp implements arqr {
    private final /* synthetic */ int l;
    public static final xih k = new xih(20);
    public static final xih j = new xih(19);
    public static final xih i = new xih(18);
    public static final xih h = new xih(17);
    public static final xih g = new xih(14);
    public static final xih f = new xih(13);
    public static final xih e = new xih(12);
    public static final xih d = new xih(11);
    public static final xih c = new xih(5);
    public static final xih b = new xih(1);
    public static final xih a = new xih(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xih(int i2) {
        super(1);
        this.l = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Size size;
        int i2 = 0;
        switch (this.l) {
            case 0:
                xaz xazVar = (xaz) obj;
                xazVar.getClass();
                return String.valueOf(xazVar.hashCode());
            case 1:
                obj.getClass();
                return obj.toString();
            case 2:
                xjm xjmVar = (xjm) obj;
                xjmVar.getClass();
                xjmVar.d();
                return arnb.a;
            case 3:
                xjm xjmVar2 = (xjm) obj;
                xjmVar2.getClass();
                xjmVar2.c();
                return arnb.a;
            case 4:
                xjm xjmVar3 = (xjm) obj;
                xjmVar3.getClass();
                xjmVar3.e();
                return arnb.a;
            case 5:
                vyv vyvVar = (vyv) obj;
                vyvVar.getClass();
                aozy aozyVar = (aozy) vyvVar.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                xlc xlcVar = (xlc) aozyVar.b;
                xlc xlcVar2 = xlc.a;
                xlcVar.d = null;
                xlcVar.b &= -2;
                return arnb.a;
            case 6:
                xnt xntVar = (xnt) obj;
                xntVar.getClass();
                aozy builder = xntVar.toBuilder();
                builder.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                xnt xntVar2 = (xnt) builder.b;
                xntVar2.b |= 1;
                xntVar2.c = true;
                apag s = builder.s();
                s.getClass();
                return (xnt) s;
            case 7:
                vpc vpcVar = (vpc) obj;
                vpcVar.getClass();
                vpcVar.a();
                return arnb.a;
            case 8:
                yqq yqqVar = (yqq) obj;
                yqqVar.getClass();
                yqqVar.a();
                return arnb.a;
            case 9:
                MediaExtractor mediaExtractor = (MediaExtractor) obj;
                mediaExtractor.getClass();
                MediaFormat c2 = yhl.c(mediaExtractor);
                if (c2 != null) {
                    long j2 = c2.getLong("durationUs");
                    if (j2 > 0) {
                        return Duration.ofMillis(j2 / TimeUnit.MILLISECONDS.toMicros(1L));
                    }
                    mediaExtractor.seekTo(0L, 0);
                    long j3 = 0;
                    while (mediaExtractor.advance()) {
                        long sampleTime = mediaExtractor.getSampleTime();
                        if (sampleTime > 0) {
                            j3 = sampleTime;
                        }
                    }
                    mediaExtractor.seekTo(0L, 0);
                    if (j3 > 0) {
                        return Duration.ofMillis(j3 / TimeUnit.MILLISECONDS.toMicros(1L));
                    }
                    throw new yhg("Could not determine video duration");
                }
                throw new yhg("Could not determine video duration");
            case 10:
                MediaExtractor mediaExtractor2 = (MediaExtractor) obj;
                mediaExtractor2.getClass();
                MediaFormat c3 = yhl.c(mediaExtractor2);
                if (c3 == null) {
                    return null;
                }
                if (c3.containsKey("rotation-degrees")) {
                    i2 = c3.getInteger("rotation-degrees");
                }
                if (i2 % 180 == 0) {
                    size = new Size(c3.getInteger("width"), c3.getInteger("height"));
                } else {
                    size = new Size(c3.getInteger("height"), c3.getInteger("width"));
                }
                return size;
            case 11:
                ((Throwable) obj).getClass();
                alvw g2 = yhp.a.g();
                g2.X(alwp.a, "BugleTranscoding");
                ((alvg) g2.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$2$1", "invoke", 241, "TranscoderImpl.kt")).q("Continuation is cancelled.");
                return arnb.a;
            case 12:
                ((Throwable) obj).getClass();
                alvw g3 = yhp.a.g();
                g3.X(alwp.a, "BugleTranscoding");
                ((alvg) g3.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1$onCompleted$1$1", "invoke", 166, "TranscoderImpl.kt")).q("Continuation is cancelled.");
                return arnb.a;
            case 13:
                ((Throwable) obj).getClass();
                alvw g4 = yhp.a.g();
                g4.X(alwp.a, "BugleTranscoding");
                ((alvg) g4.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1$onError$1$1", "invoke", 194, "TranscoderImpl.kt")).q("Continuation is cancelled.");
                return arnb.a;
            case 14:
                ead eadVar = (ead) obj;
                eadVar.getClass();
                return eadVar.b;
            case 15:
                yqq yqqVar2 = (yqq) obj;
                yqqVar2.getClass();
                yqqVar2.a();
                return arnb.a;
            case 16:
                vpc vpcVar2 = (vpc) obj;
                vpcVar2.getClass();
                vpcVar2.a();
                return arnb.a;
            case 17:
                arml armlVar = ymt.a;
                xyo e2 = yyb.V().e();
                e2.H("Could not parse input stream");
                e2.r((IOException) obj);
                return null;
            case 18:
                ahmn ahmnVar = (ahmn) obj;
                ahmnVar.getClass();
                aozy createBuilder = amza.a.createBuilder();
                createBuilder.getClass();
                apag s2 = createBuilder.s();
                s2.getClass();
                Object obj2 = ahmnVar.a;
                amza amzaVar = (amza) s2;
                aozy aozyVar2 = (aozy) obj2;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amzc amzcVar = (amzc) ((amzb) obj2).b;
                amzc amzcVar2 = amzc.a;
                amzcVar.c = amzaVar;
                amzcVar.b = 2;
                return arnb.a;
            case 19:
                Cursor cursor = ((akco) obj).a;
                return new yvh(akco.b(cursor, akco.a(cursor, "number")), cursor.getLong(akco.a(cursor, "date")));
            default:
                return ((lya) obj).a();
        }
    }
}
