package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator");

    public static final void a(ahlp ahlpVar, aftr aftrVar) {
        int i;
        Duration duration;
        int i2;
        int i3;
        String host;
        String str;
        Uri parse = Uri.parse(aftrVar.i());
        int i4 = 3;
        if (d.F(parse.getScheme(), "content") && (host = parse.getHost()) != null && arsd.z(host, "com.google.android.inputmethod.latin", false)) {
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments.size() == 3 && d.F(pathSegments.get(0), "content") && (str = pathSegments.get(1)) != null) {
                switch (str.hashCode()) {
                    case -1890252483:
                        if (str.equals("sticker")) {
                            aozy createBuilder = ampk.a.createBuilder();
                            createBuilder.getClass();
                            ahlpVar.y(aktp.bu(createBuilder));
                            return;
                        }
                        break;
                    case -1448896059:
                        if (str.equals("tenor_gif")) {
                            aozy createBuilder2 = amph.a.createBuilder();
                            createBuilder2.getClass();
                            aktp.bw("tenor.com", createBuilder2);
                            ahlpVar.v(aktp.bv(createBuilder2));
                            return;
                        }
                        break;
                    case -102405906:
                        if (str.equals("bitmoji")) {
                            aozy createBuilder3 = ampc.a.createBuilder();
                            createBuilder3.getClass();
                            apag s = createBuilder3.s();
                            s.getClass();
                            ampc ampcVar = (ampc) s;
                            aozy aozyVar = (aozy) ahlpVar.a;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            ampm ampmVar = (ampm) aozyVar.b;
                            ampm ampmVar2 = ampm.a;
                            ampmVar.d = ampcVar;
                            ampmVar.c = 106;
                            return;
                        }
                        break;
                    case 102340:
                        if (str.equals("gif")) {
                            aozy createBuilder4 = amph.a.createBuilder();
                            createBuilder4.getClass();
                            ahlpVar.v(aktp.bv(createBuilder4));
                            return;
                        }
                        break;
                    case 583427413:
                        if (str.equals("make_a_gif")) {
                            aozy createBuilder5 = amph.a.createBuilder();
                            createBuilder5.getClass();
                            if (!createBuilder5.b.isMutable()) {
                                createBuilder5.u();
                            }
                            amph.a((amph) createBuilder5.b);
                            ahlpVar.v(aktp.bv(createBuilder5));
                            return;
                        }
                        break;
                }
            }
        }
        afcp fh = aftrVar.fh();
        if (fh instanceof afgg) {
            aozy createBuilder6 = ampg.a.createBuilder();
            createBuilder6.getClass();
            apag s2 = createBuilder6.s();
            s2.getClass();
            ampg ampgVar = (ampg) s2;
            aozy aozyVar2 = (aozy) ahlpVar.a;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            ampm ampmVar3 = (ampm) aozyVar2.b;
            ampm ampmVar4 = ampm.a;
            ampmVar3.d = ampgVar;
            ampmVar3.c = 102;
            return;
        }
        if (fh instanceof afgj) {
            afgj afgjVar = (afgj) fh;
            if (aftrVar instanceof afto) {
                i = 2;
            } else if (aftrVar instanceof aftq) {
                i = 3;
            } else {
                throw new IllegalStateException("Media must be Image or Video");
            }
            if (aftrVar instanceof aftq) {
                duration = ((aftq) aftrVar).g;
            } else {
                duration = null;
            }
            if (afgjVar instanceof afgh) {
                aozy createBuilder7 = ampd.a.createBuilder();
                createBuilder7.getClass();
                aozy createBuilder8 = ampy.a.createBuilder();
                createBuilder8.getClass();
                akec.ah(i, createBuilder8);
                afgh afghVar = (afgh) afgjVar;
                int i5 = afghVar.e - 1;
                if (i5 != 0) {
                    if (i5 != 1) {
                        i2 = 2;
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 1;
                }
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                apag apagVar = createBuilder8.b;
                ampy ampyVar = (ampy) apagVar;
                ampyVar.d = i2 - 1;
                ampyVar.b |= 2;
                int i6 = afghVar.f - 1;
                if (i6 != 0) {
                    if (i6 != 1) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
                if (!apagVar.isMutable()) {
                    createBuilder8.u();
                }
                apag apagVar2 = createBuilder8.b;
                ampy ampyVar2 = (ampy) apagVar2;
                ampyVar2.e = i3 - 1;
                ampyVar2.b |= 4;
                boolean z = afghVar.a;
                if (!apagVar2.isMutable()) {
                    createBuilder8.u();
                }
                ampy ampyVar3 = (ampy) createBuilder8.b;
                ampyVar3.b |= 8;
                ampyVar3.f = z;
                if (duration != null) {
                    int seconds = (int) duration.getSeconds();
                    if (!createBuilder8.b.isMutable()) {
                        createBuilder8.u();
                    }
                    ampy ampyVar4 = (ampy) createBuilder8.b;
                    ampyVar4.b |= 16;
                    ampyVar4.g = seconds;
                }
                int i7 = afghVar.d - 1;
                if (i7 != 0) {
                    if (i7 != 1) {
                        i4 = 5;
                    } else {
                        i4 = 2;
                    }
                }
                akec.ag(i4, createBuilder8);
                String str2 = afghVar.c;
                if (str2 != null) {
                    if (!createBuilder8.b.isMutable()) {
                        createBuilder8.u();
                    }
                    ampy ampyVar5 = (ampy) createBuilder8.b;
                    ampyVar5.b |= 32;
                    ampyVar5.h = str2;
                }
                aktp.by(akec.af(createBuilder8), createBuilder7);
                ahlpVar.u(aktp.bx(createBuilder7));
                return;
            }
            if (afgjVar instanceof afgi) {
                aozy createBuilder9 = ampd.a.createBuilder();
                createBuilder9.getClass();
                aozy createBuilder10 = ampy.a.createBuilder();
                createBuilder10.getClass();
                akec.ah(i, createBuilder10);
                akec.ag(4, createBuilder10);
                aktp.by(akec.af(createBuilder10), createBuilder9);
                ahlpVar.u(aktp.bx(createBuilder9));
                return;
            }
            throw new armm();
        }
        if (fh instanceof VideoTrimmerSource) {
            aozy createBuilder11 = ampl.a.createBuilder();
            createBuilder11.getClass();
            apag s3 = createBuilder11.s();
            s3.getClass();
            ampl amplVar = (ampl) s3;
            aozy aozyVar3 = (aozy) ahlpVar.a;
            if (!aozyVar3.b.isMutable()) {
                aozyVar3.u();
            }
            ampm ampmVar5 = (ampm) aozyVar3.b;
            ampm ampmVar6 = ampm.a;
            ampmVar5.d = amplVar;
            ampmVar5.c = 108;
            return;
        }
        if (fh instanceof afqe) {
            aozy createBuilder12 = ampe.a.createBuilder();
            createBuilder12.getClass();
            boolean a2 = ((afqe) fh).a();
            if (!createBuilder12.b.isMutable()) {
                createBuilder12.u();
            }
            ampe ampeVar = (ampe) createBuilder12.b;
            ampeVar.b |= 1;
            ampeVar.c = a2;
            apag s4 = createBuilder12.s();
            s4.getClass();
            ampe ampeVar2 = (ampe) s4;
            aozy aozyVar4 = (aozy) ahlpVar.a;
            if (!aozyVar4.b.isMutable()) {
                aozyVar4.u();
            }
            ampm ampmVar7 = (ampm) aozyVar4.b;
            ampm ampmVar8 = ampm.a;
            ampmVar7.d = ampeVar2;
            ampmVar7.c = 110;
            return;
        }
        if (fh instanceof afcm) {
            aozy createBuilder13 = ampf.a.createBuilder();
            createBuilder13.getClass();
            apag s5 = createBuilder13.s();
            s5.getClass();
            ampf ampfVar = (ampf) s5;
            aozy aozyVar5 = (aozy) ahlpVar.a;
            if (!aozyVar5.b.isMutable()) {
                aozyVar5.u();
            }
            ampm ampmVar9 = (ampm) aozyVar5.b;
            ampm ampmVar10 = ampm.a;
            ampmVar9.d = ampfVar;
            ampmVar9.c = 103;
            return;
        }
        if (fh instanceof afco) {
            alvw d = a.d();
            d.X(alwp.a, "BugleComposeRow2");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setVisualLocalMediaSource", 291, "AttachmentInfoCreator.kt")).t("Skipping MediaSource for %s", fh);
        } else {
            alvw h = a.h();
            h.X(alwp.a, "BugleComposeRow2");
            ((alvg) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setVisualLocalMediaSource", 294, "AttachmentInfoCreator.kt")).t("Cannot set MediaSource for unhandled LocalMedia source %s", fh);
        }
    }

    public static final void b(ahlp ahlpVar, afqs afqsVar, Uri uri) {
        Object obj;
        boolean z = afqsVar instanceof afql;
        if (!z && !(afqsVar instanceof afxr)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = afqsVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (d.F(((afqr) obj).b, uri.toString())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        afqr afqrVar = (afqr) obj;
        if (afqrVar != null) {
            if (d.F(afqsVar.b(), afqrVar.e)) {
                ahlp bE = aktp.bE(ampm.a.createBuilder());
                bE.z(afqrVar.c);
                bE.w(afqrVar.d);
                bE.x(afwv.J(afqrVar).a());
                if (z) {
                    aozy createBuilder = amph.a.createBuilder();
                    createBuilder.getClass();
                    String host = uri.getHost();
                    if (host != null) {
                        aktp.bw(host, createBuilder);
                    }
                    bE.v(aktp.bv(createBuilder));
                } else if (afqsVar instanceof afxr) {
                    aozy createBuilder2 = ampk.a.createBuilder();
                    createBuilder2.getClass();
                    String L = ahmc.L(((afxr) afqsVar).a);
                    L.getClass();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ampk ampkVar = (ampk) createBuilder2.b;
                    ampkVar.b |= 1;
                    ampkVar.c = L;
                    bE.y(aktp.bu(createBuilder2));
                }
                ahlpVar.E(bE.t());
                return;
            }
            throw new IllegalStateException(a.cd(afqrVar, afqsVar, "GifStickerMedia and selected variation source are not equal: ", ", "));
        }
        throw new IllegalStateException(a.cd(afqsVar, uri, "Selected URI ", " not found in "));
    }

    public static final void c(ahlp ahlpVar, afcv afcvVar) {
        if (gh.y(afcvVar.d().a())) {
            aozy createBuilder = amos.a.createBuilder();
            createBuilder.getClass();
            akec.V(1, createBuilder);
            ahlpVar.B(akec.U(createBuilder));
            return;
        }
        aozy createBuilder2 = amoy.a.createBuilder();
        createBuilder2.getClass();
        long b = afcvVar.b();
        long j = 0;
        if (b >= 0) {
            if (b != 0) {
                if (b < 7500) {
                    j = 5000;
                } else if (b < 2000000) {
                    j = hlc.K(b, 10000L);
                } else if (b < 10000000) {
                    j = hlc.K(b, 100000L);
                } else {
                    j = hlc.K(b, 1000000L);
                }
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amoy amoyVar = (amoy) createBuilder2.b;
            amoyVar.b = 1 | amoyVar.b;
            amoyVar.c = j;
            String a2 = afcvVar.d().a();
            a2.getClass();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amoy amoyVar2 = (amoy) createBuilder2.b;
            amoyVar2.b |= 2;
            amoyVar2.d = a2;
            apag s = createBuilder2.s();
            s.getClass();
            amoy amoyVar3 = (amoy) s;
            aozy aozyVar = (aozy) ahlpVar.a;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amoq amoqVar = (amoq) aozyVar.b;
            amoq amoqVar2 = amoq.a;
            amoqVar.f = amoyVar3;
            amoqVar.e = 208;
            return;
        }
        throw new IllegalArgumentException(a.ck(b, "File size is negative: "));
    }
}
