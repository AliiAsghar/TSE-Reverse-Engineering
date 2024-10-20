package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juf extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juf(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v65, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v70, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v73, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v79, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ascv, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Optional empty;
        lrc lrcVar = null;
        switch (this.b) {
            case 0:
                jug jugVar = (jug) this.a;
                if (((ovh) jugVar.i.b()).a() && ((ovj) jugVar.j.b()).a()) {
                    jug jugVar2 = (jug) this.a;
                    return qkf.d(jugVar2.m.a, jugVar2.c, jld.s);
                }
                return ascy.a(true);
            case 1:
                jug jugVar3 = (jug) this.a;
                jugVar3.c(new jue(jugVar3, null, 2, null));
                return arnb.a;
            case 2:
                this.a.a();
                return arnb.a;
            case 3:
                return ((jvw) ((jvs) this.a).c.b()).b().c;
            case 4:
                jvw jvwVar = (jvw) this.a;
                agip agipVar = ((aghy) jvwVar.f.b()).c;
                jvt jvtVar = new jvt(agipVar, jvwVar);
                apax apaxVar = ((nhs) nhr.g.e()).b;
                apaxVar.getClass();
                Object b = jvwVar.h.b();
                b.getClass();
                agii agiiVar = new agii(jvwVar.i, apaxVar, ((Boolean) b).booleanValue(), jvwVar.k.a);
                if (((ansy) ((nio) jvwVar.d).a.b()).e("bugle.enable_audio_recorder_denoiser")) {
                    empty = jvwVar.g;
                } else {
                    empty = Optional.empty();
                }
                boolean a = ((ogy) jvwVar.e.b()).a();
                return new agip(agipVar.a, agipVar.b, jvtVar, agipVar.d, agipVar.e, agipVar.f, agipVar.g, agiiVar, agipVar.m, true, empty, a, true);
            case 5:
                return ((aghy) ((jvw) this.a).f.b()).b;
            case 6:
                jwc jwcVar = (jwc) this.a;
                jwcVar.e = "";
                lrc lrcVar2 = jwcVar.g;
                if (lrcVar2 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar2;
                }
                jwc jwcVar2 = (jwc) this.a;
                aeqa aeqaVar = jwcVar2.f;
                aeqaVar.getClass();
                lrcVar.b(jwcVar2.a(aeqaVar));
                return arnb.a;
            case 7:
                lrc lrcVar3 = ((jwc) this.a).g;
                if (lrcVar3 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar3;
                }
                lrcVar.a();
                return arnb.a;
            case 8:
                Object obj = this.a;
                ((jws) obj).c.c(new jsv(obj, 9));
                return arnb.a;
            case 9:
                this.a.a();
                return arnb.a;
            case 10:
                this.a.a();
                return arnb.a;
            case 11:
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((jxd) obj2).b.a();
                }
                return arnb.a;
            case 12:
                this.a.a();
                return arnb.a;
            case 13:
                ((lkd) ((nei) this.a).a).b(new lmb());
                return arnb.a;
            case 14:
                iji ijiVar = (iji) this.a;
                qjh.l(ijiVar.c, null, new jsu(ijiVar, (arpe) null, 9), 3);
                return arnb.a;
            case 15:
                return (znj) this.a.b();
            case 16:
                return (jdw) this.a.b();
            case 17:
                return (jei) this.a.b();
            case 18:
                return (jed) this.a.b();
            case 19:
                return (mjg) this.a.b();
            default:
                return (jfa) this.a.b();
        }
    }
}
