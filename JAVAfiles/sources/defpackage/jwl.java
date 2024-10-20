package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jwl extends arrm implements arqg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, byte[] bArr) {
        super(0, obj, jvs.class, "onPressReleased", "onPressReleased()V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [kjf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [kjf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                jwp jwpVar = (jwp) this.e;
                qjh.l(jwpVar.b, null, new jpc(jwpVar, (arpe) null, 16), 3);
                return arnb.a;
            case 1:
                ((jvs) this.e).d();
                return arnb.a;
            case 2:
                jyk jykVar = (jyk) this.e;
                qjh.l(jykVar.f, null, new jpc(jykVar, (arpe) null, 18), 3);
                return arnb.a;
            case 3:
                ((lrc) this.e).a();
                return arnb.a;
            case 4:
                ((khs) this.e).a();
                return arnb.a;
            case 5:
                ((lrc) this.e).a();
                return arnb.a;
            case 6:
                ((khs) this.e).a();
                return arnb.a;
            case 7:
                ((kgg) this.e).c();
                return arnb.a;
            case 8:
                ((kgg) this.e).c();
                return arnb.a;
            case 9:
                ((kgj) this.e).a();
                return arnb.a;
            case 10:
                ((kgj) this.e).a();
                return arnb.a;
            case 11:
                ((khw) this.e).s.e(null);
                return arnb.a;
            case 12:
                ((kkc) this.e).b.d();
                return arnb.a;
            case 13:
                ((kkc) this.e).b.c();
                return arnb.a;
            case 14:
                return false;
            case 15:
                ((lex) this.e).w(0);
                return arnb.a;
            case 16:
                ((lex) this.e).w(8);
                return arnb.a;
            case 17:
                ((lgg) this.e).a();
                return arnb.a;
            case 18:
                lhm lhmVar = (lhm) this.e;
                ((ljn) lhmVar.f.b()).c(4, (amwf) lhmVar.e);
                lim limVar = (lim) lhmVar.m;
                Object b = limVar.b.b();
                b.getClass();
                lim.a((ahqr) b, ljo.c);
                Object b2 = limVar.b.b();
                b2.getClass();
                lim.a((ahqr) b2, ljo.b);
                limVar.c.b(ljo.e, null);
                lim.a.o("multi-share list is interactive");
                return arnb.a;
            case 19:
                lig ligVar = (lig) this.e;
                akrc b3 = ((aksr) ligVar.d).b("MultiShare MirrorExtendedFabAdapterImpl#onClick");
                try {
                    int size = ((lgd) ligVar.k).b().a.size();
                    if (size == 1) {
                        ((ljn) ligVar.g.b()).b(1);
                        ChipData chipData = (ChipData) ((lgd) ligVar.k).b().a.get(0);
                        ChipId chipId = chipData.a;
                        if (chipId instanceof ChipId.Identity) {
                            qjh.l(ligVar.a, ligVar.b, new jyw(ligVar, ((ChipId.Identity) chipId).a, chipData.b, (arpe) null, 7), 2);
                        } else if (chipId instanceof ChipId.Conversation) {
                            ligVar.a(((ChipId.Conversation) chipId).a);
                        } else {
                            throw new armm();
                        }
                    } else {
                        ((ljn) ligVar.g.b()).b(size);
                        ((izz) ligVar.l).c.f(true);
                    }
                    armd.i(b3, null);
                    return arnb.a;
                } finally {
                }
            default:
                zbk zbkVar = (zbk) this.e;
                ijp.e((ijp) zbkVar.b, 14, 0, zbkVar.a, 10);
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i) {
        super(0, obj, jwp.class, "onCloseClicked", "onCloseClicked()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, char[] cArr) {
        super(0, obj, jyk.class, "handlePagingError", "handlePagingError()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, short[] sArr) {
        super(0, obj, lrc.class, "hide", "hide()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, float[] fArr) {
        super(0, obj, khs.class, "openSatelliteSettings", "openSatelliteSettings()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, byte[][] bArr) {
        super(0, obj, kgg.class, "handleListButtonClicked", "handleListButtonClicked()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, int[][] iArr) {
        super(0, obj, kgj.class, "handleListButtonClicked", "handleListButtonClicked()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, boolean[][] zArr) {
        super(0, obj, khw.class, "onEffectFinished", "onEffectFinished()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, float[][] fArr) {
        super(0, obj, kkc.class, "onPreviousClick", "onPreviousClick()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, byte[][][] bArr) {
        super(0, obj, kkc.class, "onNextClick", "onNextClick()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, char[][][] cArr) {
        super(0, obj, oho.class, "get", "get()Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, short[][][] sArr) {
        super(0, obj, lex.class, "setContactPickerContainerToVisible", "setContactPickerContainerToVisible()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, int[][][] iArr) {
        super(0, obj, lex.class, "setContactPickerContainerToGone", "setContactPickerContainerToGone()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, boolean[][][] zArr) {
        super(0, obj, lgg.class, "dismissDialog", "dismissDialog()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, float[][][] fArr) {
        super(0, obj, lhm.class, "onListInteractive", "onListInteractive()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(0, obj, lig.class, "onClick", "onClick()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl(Object obj, int i, char[] cArr, byte[] bArr) {
        super(0, obj, zbk.class, "onActivateFastScroll", "onActivateFastScroll()V", 0);
        this.a = i;
    }
}
