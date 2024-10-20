package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgt extends mdy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger");
    public final arwe b;
    private final jgo d;
    private final Optional e;
    private final Optional f;
    private final armf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgt(arwe arweVar, jgo jgoVar, Optional optional, Optional optional2, armf armfVar, armf armfVar2, itw itwVar, Executor executor) {
        super(armfVar2, itwVar, executor);
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        executor.getClass();
        this.b = arweVar;
        this.d = jgoVar;
        this.e = optional;
        this.f = optional2;
        this.g = armfVar;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(8);
    }

    public final List b(jgu jguVar, jgp jgpVar) {
        Uri uri;
        List list;
        jgp jgpVar2;
        int i;
        String str;
        List<jha> list2 = jguVar.a.b;
        ArrayList arrayList = new ArrayList(aqjn.J(list2, 10));
        for (jha jhaVar : list2) {
            if (jhaVar instanceof jgz) {
                jgz jgzVar = (jgz) jhaVar;
                afcq afcqVar = jgzVar.a;
                amqi amqiVar = null;
                if (afcqVar instanceof afsn) {
                    if (jguVar.c.containsKey(afcqVar)) {
                        uri = (Uri) aqjn.l(jguVar.c, afcqVar);
                    } else {
                        throw new IllegalArgumentException("Missing selected variation for ".concat(String.valueOf(afcqVar.fj())));
                    }
                } else {
                    uri = null;
                }
                if (((Boolean) this.g.b()).booleanValue() && (str = (String) jguVar.d.get(afcqVar)) != null) {
                    list = this.d.a(str, jguVar.b, true);
                } else {
                    list = arnv.a;
                }
                if (true != (jgzVar.a instanceof afto)) {
                    jgpVar2 = null;
                } else {
                    jgpVar2 = jgpVar;
                }
                jgg jggVar = new jgg(jgzVar, uri, jgpVar2);
                ahlp aV = akec.aV(amoq.a.createBuilder());
                jgz jgzVar2 = jggVar.a;
                afcp fh = jgzVar2.a.fh();
                if (fh instanceof afcu) {
                    afcu afcuVar = (afcu) fh;
                    if (afcuVar instanceof afct) {
                        jgn.b(aV, amqh.FILE);
                    } else if (afcuVar instanceof aftp) {
                        aftp aftpVar = (aftp) afcuVar;
                        if (aftpVar instanceof afgg) {
                            jgn.b(aV, amqh.CAMERA_GALLERY);
                        } else if (aftpVar instanceof afgj) {
                            afgj afgjVar = (afgj) aftpVar;
                            if (afgjVar instanceof afgh) {
                                amqh amqhVar = amqh.CAMERA_GALLERY;
                                if (((afgh) afgjVar).d == 2) {
                                    amqiVar = amqi.EXPANDED;
                                }
                                jgn.a(aV, amqhVar, amqiVar);
                            } else if (afgjVar instanceof afgi) {
                                jgn.a(aV, amqh.CAMERA_GALLERY, amqi.EXPANDED);
                            } else {
                                throw new armm();
                            }
                        } else if (aftpVar instanceof afqe) {
                            jgn.b(aV, amqh.EMOTIFY);
                        } else if (aftpVar instanceof aggr) {
                            jgn.b(aV, amqh.VOICE);
                        } else if (aftpVar instanceof VideoTrimmerSource) {
                            jgn.b(aV, amqh.UNKNOWN_COMPOSE_SCREEN_CATEGORY);
                        } else {
                            alvw h = jgn.b.h();
                            h.X(alwp.a, "BugleComposeRow2");
                            ((alvg) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setLocalMediaOrigin", 144, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown LocalMedia.Source %s", aftpVar);
                        }
                    } else {
                        alvw h2 = jgn.b.h();
                        h2.X(alwp.a, "BugleComposeRow2");
                        ((alvg) h2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setLocalAttachmentOrigin", 129, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown LocalAttachment.Source %s", afcuVar);
                    }
                } else if (fh instanceof afqq) {
                    afqq afqqVar = (afqq) fh;
                    afcq afcqVar2 = jgzVar2.a;
                    boolean z = afqqVar instanceof afqp;
                    int i2 = arsc.a;
                    arrh arrhVar = new arrh(afcqVar2.getClass());
                    if (z) {
                        if (d.F(arrhVar, new arrh(afql.class))) {
                            jgn.b(aV, amqh.GIF);
                        } else if (d.F(arrhVar, new arrh(afxr.class))) {
                            jgn.b(aV, amqh.STICKER);
                        } else {
                            alvw h3 = jgn.b.h();
                            h3.X(alwp.a, "BugleComposeRow2");
                            ((alvg) h3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setGifStickerMediaOrigin", 174, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for GifStickerMedia.Source with attachment type", arrhVar);
                        }
                    } else if (afqqVar instanceof afxq) {
                        if (d.F((afxq) afqqVar, afxq.a)) {
                            jgn.b(aV, amqh.STICKER);
                        } else {
                            throw new armm();
                        }
                    } else {
                        alvw h4 = jgn.b.h();
                        h4.X(alwp.a, "BugleComposeRow2");
                        ((alvg) h4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setGifStickerMediaOrigin", 184, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown GifStickerMedia.Source %s", afqqVar);
                    }
                } else if (fh instanceof afcm) {
                    afcm afcmVar = (afcm) fh;
                    int i3 = afcmVar.b - 1;
                    if (i3 != 2 && i3 != 3) {
                        jgn.b(aV, amqh.EXTERNAL);
                    } else {
                        aozy createBuilder = ampa.a.createBuilder();
                        createBuilder.getClass();
                        String str2 = afcmVar.a;
                        if (str2 != null && arsd.z(str2, "com.google.android.inputmethod.latin", false)) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        aktp.bA(i, createBuilder);
                        aV.D(aktp.bz(createBuilder));
                    }
                } else if (fh instanceof afcn) {
                    jgn.b(aV, amqh.EXTERNAL);
                } else if (fh instanceof afco) {
                    jgn.b(aV, amqh.UNKNOWN_COMPOSE_SCREEN_CATEGORY);
                }
                afcq afcqVar3 = jggVar.a.a;
                if (afcqVar3 instanceof afto) {
                    afto aftoVar = (afto) afcqVar3;
                    if (d.F(aftoVar.g, afct.a)) {
                        jgh.c(aV, aftoVar);
                    } else {
                        ahlp bE = aktp.bE(ampm.a.createBuilder());
                        bE.z(aftoVar.d);
                        bE.w(aftoVar.e);
                        bE.x(afwv.F(aftoVar).a());
                        jgh.a(bE, aftoVar);
                        aV.E(bE.t());
                    }
                } else if (afcqVar3 instanceof aftq) {
                    aftq aftqVar = (aftq) afcqVar3;
                    if (d.F(aftqVar.f, afct.a)) {
                        jgh.c(aV, aftqVar);
                    } else {
                        ahlp bE2 = aktp.bE(ampm.a.createBuilder());
                        bE2.z(aftqVar.c);
                        bE2.w(aftqVar.d);
                        bE2.x(afwv.F(aftqVar).a());
                        int seconds = (int) aftqVar.g.getSeconds();
                        aozy aozyVar = (aozy) bE2.a;
                        if (!aozyVar.b.isMutable()) {
                            aozyVar.u();
                        }
                        ampm ampmVar = (ampm) aozyVar.b;
                        ampmVar.b |= 16;
                        ampmVar.h = seconds;
                        jgh.a(bE2, aftqVar);
                        aV.E(bE2.t());
                    }
                } else if (afcqVar3 instanceof aftn) {
                    aftn aftnVar = (aftn) afcqVar3;
                    if (d.F(aftnVar.d, afct.a)) {
                        jgh.c(aV, aftnVar);
                    } else {
                        aozy createBuilder2 = amor.a.createBuilder();
                        createBuilder2.getClass();
                        int seconds2 = (int) aftnVar.e.getSeconds();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amor amorVar = (amor) createBuilder2.b;
                        amorVar.b |= 1;
                        amorVar.c = seconds2;
                        apag s = createBuilder2.s();
                        s.getClass();
                        amor amorVar2 = (amor) s;
                        aozy aozyVar2 = (aozy) aV.a;
                        if (!aozyVar2.b.isMutable()) {
                            aozyVar2.u();
                        }
                        amoq amoqVar = (amoq) aozyVar2.b;
                        amoqVar.f = amorVar2;
                        amoqVar.e = 207;
                    }
                } else if (afcqVar3 instanceof afcw) {
                    jgh.c(aV, (afcw) afcqVar3);
                } else if (afcqVar3 instanceof afql) {
                    afql afqlVar = (afql) afcqVar3;
                    Uri uri2 = jggVar.b;
                    if (uri2 != null) {
                        jgh.b(aV, afqlVar, uri2);
                    } else {
                        throw new IllegalStateException("GifMedia missing selectedUri");
                    }
                } else if (afcqVar3 instanceof afxr) {
                    afxr afxrVar = (afxr) afcqVar3;
                    Uri uri3 = jggVar.b;
                    if (uri3 != null) {
                        jgh.b(aV, afxrVar, uri3);
                    } else {
                        throw new IllegalStateException("StickerMedia missing selectedUri");
                    }
                } else if (afcqVar3 instanceof afqc) {
                    afqc afqcVar = (afqc) afcqVar3;
                    ahlp bE3 = aktp.bE(ampm.a.createBuilder());
                    bE3.z(afqcVar.f);
                    bE3.w(afqcVar.g);
                    bE3.x(afwv.F(afqcVar).a());
                    jgh.a(bE3, afqcVar);
                    aV.E(bE3.t());
                }
                alhp alhpVar = jggVar.a.b.c;
                if (alhpVar != null && alhpVar.a) {
                    aozn c = apdp.c(alhpVar.a(TimeUnit.MILLISECONDS));
                    c.getClass();
                    aozy aozyVar3 = (aozy) aV.a;
                    if (!aozyVar3.b.isMutable()) {
                        aozyVar3.u();
                    }
                    amoq amoqVar2 = (amoq) aozyVar3.b;
                    amoqVar2.i = c;
                    amoqVar2.b |= 1;
                }
                jgp jgpVar3 = jggVar.c;
                if (jgpVar3 instanceof jgp) {
                    aozy createBuilder3 = amoz.a.createBuilder();
                    createBuilder3.getClass();
                    boolean z2 = jgpVar3.a;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar = createBuilder3.b;
                    amoz amozVar = (amoz) apagVar;
                    amozVar.b = 1 | amozVar.b;
                    amozVar.c = z2;
                    int i4 = jgpVar3.b;
                    if (!apagVar.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar2 = createBuilder3.b;
                    amoz amozVar2 = (amoz) apagVar2;
                    amozVar2.b |= 2;
                    amozVar2.d = i4;
                    int i5 = jgpVar3.c;
                    if (!apagVar2.isMutable()) {
                        createBuilder3.u();
                    }
                    amoz amozVar3 = (amoz) createBuilder3.b;
                    amozVar3.b |= 4;
                    amozVar3.e = i5;
                    apag s2 = createBuilder3.s();
                    s2.getClass();
                    amoz amozVar4 = (amoz) s2;
                    aozy aozyVar4 = (aozy) aV.a;
                    if (!aozyVar4.b.isMutable()) {
                        aozyVar4.u();
                    }
                    amoq amoqVar3 = (amoq) aozyVar4.b;
                    amoqVar3.h = amozVar4;
                    amoqVar3.g = 301;
                } else {
                    alvw e = jgh.a.e();
                    e.X(alwp.a, "BugleComposeRow2");
                    ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setCompressionInfo", 243, "AttachmentInfoCreator.kt")).t("Not adding unsupported compression info %s", jggVar.c);
                }
                arrayList.add(aqjn.aq(aqjn.y(aV.A()), list));
            } else {
                Objects.toString(jhaVar);
                throw new IllegalArgumentException("Cannot create AttachmentInfo for pending ".concat(String.valueOf(jhaVar)));
            }
        }
        return arrayList;
    }

    public final List c(jhc jhcVar, jgi jgiVar) {
        String str = jhcVar.a;
        if (str != null) {
            return this.d.a(str, jgiVar, false);
        }
        return null;
    }

    public final void d(jgu jguVar, mvw mvwVar, jgp jgpVar) {
        mvwVar.getClass();
        qjh.l(this.b, null, new jsh(jguVar, mvwVar, jgpVar, this, (arpe) null, 1), 3);
    }

    public final Object e(jhc jhcVar) {
        wjh wjhVar;
        if (jhcVar.f == null || (wjhVar = (wjh) arsd.k(this.f)) == null) {
            return null;
        }
        Object a2 = wjhVar.a();
        if (a2 == arpl.a) {
            return a2;
        }
        return (amrj) a2;
    }

    public final void f(jhc jhcVar) {
        this.e.ifPresent(new ixj(new ipk(jhcVar, 10), 12));
    }
}
