package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ezu implements etv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ezu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.etv
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                int i = fad.G;
                boolean z = ((fay) this.a).h;
                ((err) obj).l();
                return;
            case 1:
                int i2 = fad.G;
                ((err) obj).n();
                return;
            case 2:
                int i3 = fad.G;
                fay fayVar = (fay) this.a;
                boolean z2 = fayVar.l;
                int i4 = fayVar.f;
                ((err) obj).s();
                return;
            case 3:
                int i5 = fad.G;
                ((err) obj).eC(((fay) this.a).f);
                return;
            case 4:
                int i6 = fad.G;
                fay fayVar2 = (fay) this.a;
                boolean z3 = fayVar2.l;
                int i7 = fayVar2.m;
                ((err) obj).p();
                return;
            case 5:
                int i8 = fad.G;
                ((err) obj).z();
                return;
            case 6:
                ((err) obj).eJ();
                return;
            case 7:
                int i9 = fad.G;
                int i10 = ((fay) this.a).n;
                ((err) obj).r();
                return;
            case 8:
                int i11 = fad.G;
                ((err) obj).eB(((fay) this.a).g());
                return;
            case 9:
                int i12 = fad.G;
                ero eroVar = ((fay) this.a).o;
                ((err) obj).q();
                return;
            case 10:
                int i13 = fad.G;
                ((err) obj).eE(((fay) this.a).g);
                return;
            case 11:
                int i14 = fad.G;
                ((err) obj).eD(((fay) this.a).g);
                return;
            case 12:
                int i15 = fad.G;
                ((err) obj).eG((esg) ((fay) this.a).u.b);
                return;
            case 13:
                int i16 = faa.b;
                ((err) obj).a((eta) this.a);
                return;
            case 14:
                ((err) obj).n();
                return;
            case 15:
                int i17 = faa.b;
                ((err) obj).o();
                return;
            case 16:
                int i18 = faa.b;
                ((err) obj).k();
                return;
            case 17:
                int i19 = faa.b;
                ((err) obj).eH((esn) this.a);
                return;
            case 18:
                return;
            case 19:
                ((fbw) obj).l = (ern) this.a;
                return;
            default:
                fbw fbwVar = (fbw) obj;
                int i20 = fbwVar.o;
                ezh ezhVar = (ezh) this.a;
                fbwVar.o = i20 + ezhVar.g;
                fbwVar.p += ezhVar.e;
                return;
        }
    }
}
