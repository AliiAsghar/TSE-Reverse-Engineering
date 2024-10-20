package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import j$.time.Duration;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmo extends arpw implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(arwe arweVar, long j, asai[] asaiVarArr, boolean[] zArr, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = arweVar;
        this.a = j;
        this.c = asaiVarArr;
        this.d = zArr;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return ((jmo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                            }
                            return ((jmo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                        }
                        return ((jmo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                    }
                    return ((jmo) c((asaj) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((jmo) c((asaj) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((jmo) c((asaj) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((jmo) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [arwe, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.e;
        byte[] bArr = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                aqil.P(obj);
                                Object obj2 = this.c;
                                long j = this.a;
                                Object obj3 = this.d;
                                xam xamVar = (xam) this.b;
                                qjh.l(xamVar.b, null, new jmo(xamVar, (String) obj3, j, (Duration) obj2, (arpe) null, 5), 3);
                                return arnb.a;
                            }
                            aqil.P(obj);
                            alvw g = xam.a.g();
                            g.X(alwp.a, "BugleTelephony");
                            alvg alvgVar = (alvg) g;
                            alvgVar.V(10, TimeUnit.SECONDS);
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 66, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Logging RCS Telephony persistence success event to clearcut.");
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfqVar.getClass();
                            alzz.n(amfp.TELEPHONY_PERSISTENCE_EVENT, amfqVar);
                            aozy createBuilder = amnd.a.createBuilder();
                            createBuilder.getClass();
                            akec.at(yyb.aQ((String) this.d), createBuilder);
                            akec.au(yyb.aR(this.a), createBuilder);
                            akec.as(yyb.aR(xam.b()), createBuilder);
                            aozy createBuilder2 = amyj.a.createBuilder();
                            createBuilder2.getClass();
                            aozy createBuilder3 = amyl.a.createBuilder();
                            createBuilder3.getClass();
                            aozn j2 = aoue.j((Duration) this.c);
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            amyl amylVar = (amyl) createBuilder3.b;
                            amylVar.c = j2;
                            amylVar.b |= 1;
                            apag s = createBuilder3.s();
                            s.getClass();
                            amyl amylVar2 = (amyl) s;
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            amyj amyjVar = (amyj) createBuilder2.b;
                            amyjVar.c = amylVar2;
                            amyjVar.b = 1;
                            akec.ar(aktp.aE(createBuilder2), createBuilder);
                            alzz.q(akec.aq(createBuilder), amfqVar);
                            aozy builder = alzz.h(amfqVar).toBuilder();
                            builder.getClass();
                            try {
                                ((xam) this.b).a((amfq) builder);
                            } catch (Exception e) {
                                alvw i2 = xam.a.i();
                                i2.X(alwp.a, "BugleTelephony");
                                ((alvg) ((alvg) i2).g(e).h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 81, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Failed to log telephony file persist success event to clearcut");
                            }
                            alvw g2 = xam.a.g();
                            g2.X(alwp.a, "BugleTelephony");
                            alvg alvgVar2 = (alvg) g2;
                            alvgVar2.V(10, TimeUnit.SECONDS);
                            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 87, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Successfully logged RCS Telephony persistence success event to clearcut.");
                            return arnb.a;
                        }
                        aqil.P(obj);
                        uiw uiwVar = (uiw) this.c;
                        yfo yfoVar = uiwVar.c;
                        Object obj4 = this.d;
                        Object obj5 = this.b;
                        Rect g3 = yfoVar.g((Uri) obj5, (String) obj4);
                        int width = g3.width();
                        int height = g3.height();
                        try {
                            boolean z = gh.z((String) obj4);
                            long j3 = this.a;
                            xrq xrqVar = uiwVar.b;
                            int i3 = (int) j3;
                            if (z) {
                                bArr = xrqVar.c((Uri) obj5, i3, width, height);
                            } else {
                                bArr = xrqVar.b((Uri) obj5, (String) obj4, i3, width, height);
                            }
                        } catch (IOException e2) {
                            ((alwl) ((alwl) ((alwl) xrq.a.h()).g(e2)).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getImagePreview", '^', "FilePreviewCreator.java")).q("Cannot get a file transfer preview.");
                        }
                        return bArr;
                    }
                    aqil.P(obj);
                    qjh.l(this.b, null, new jmn(this.a, (asai[]) this.c, (boolean[]) this.d, (arpe) null, 4, (short[]) null), 3);
                    return arnb.a;
                }
                aqil.P(obj);
                qjh.l(this.b, null, new jmn(this.a, (asai[]) this.c, (boolean[]) this.d, (arpe) null, 2, (char[]) null), 3);
                return arnb.a;
            }
            aqil.P(obj);
            qjh.l(this.b, null, new jmn(this.a, (asai[]) this.c, (boolean[]) this.d, (arpe) null, 1, (byte[]) null), 3);
            return arnb.a;
        }
        aqil.P(obj);
        qjh.l(this.b, null, new jmn(this.a, (asai[]) this.c, (boolean[]) this.d, (arpe) null, 0), 3);
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [arwe, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                Object obj2 = this.b;
                                return new jmo((xam) obj2, (String) this.d, this.a, (Duration) this.c, arpeVar, 6, (byte[]) null);
                            }
                            Object obj3 = this.b;
                            return new jmo((xam) obj3, (String) this.d, this.a, (Duration) this.c, arpeVar, 5);
                        }
                        Object obj4 = this.c;
                        Object obj5 = this.b;
                        return new jmo((uiw) obj4, (Uri) obj5, (String) this.d, this.a, arpeVar, 4);
                    }
                    return new jmo((arwe) this.b, this.a, (asai[]) this.c, (boolean[]) this.d, arpeVar, 3, (short[]) null);
                }
                return new jmo((arwe) this.b, this.a, (asai[]) this.c, (boolean[]) this.d, arpeVar, 2, (char[]) null);
            }
            return new jmo((arwe) this.b, this.a, (asai[]) this.c, (boolean[]) this.d, arpeVar, 1, (byte[]) null);
        }
        return new jmo((arwe) this.b, this.a, (asai[]) this.c, (boolean[]) this.d, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(arwe arweVar, long j, asai[] asaiVarArr, boolean[] zArr, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.e = i;
        this.b = arweVar;
        this.a = j;
        this.c = asaiVarArr;
        this.d = zArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(arwe arweVar, long j, asai[] asaiVarArr, boolean[] zArr, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.e = i;
        this.b = arweVar;
        this.a = j;
        this.c = asaiVarArr;
        this.d = zArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(arwe arweVar, long j, asai[] asaiVarArr, boolean[] zArr, arpe arpeVar, int i, short[] sArr) {
        super(2, arpeVar);
        this.e = i;
        this.b = arweVar;
        this.a = j;
        this.c = asaiVarArr;
        this.d = zArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(uiw uiwVar, Uri uri, String str, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.c = uiwVar;
        this.b = uri;
        this.d = str;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(xam xamVar, String str, long j, Duration duration, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = xamVar;
        this.d = str;
        this.a = j;
        this.c = duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(xam xamVar, String str, long j, Duration duration, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.e = i;
        this.b = xamVar;
        this.d = str;
        this.a = j;
        this.c = duration;
    }
}
