package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fzw extends gcj {
    public int a;
    public int b;
    public int c;
    public int d;
    public final rae e;
    private final gdk l;
    private final Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzw(gdk gdkVar, arwe arweVar, arwb arwbVar, arwb arwbVar2, akrq akrqVar, gdj gdjVar, Object obj) {
        super(gdkVar, arweVar, arwbVar, new gcm(), akrqVar);
        int i;
        int i2;
        boolean z;
        gdjVar.getClass();
        this.l = gdkVar;
        this.m = obj;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
        gcm gcmVar = this.h;
        gcmVar.getClass();
        this.e = new rae(arweVar, akrqVar, gdkVar, arwbVar, arwbVar2, this, gcmVar);
        gcm gcmVar2 = this.h;
        int i3 = gdjVar.e;
        if (i3 != Integer.MIN_VALUE) {
            i = i3;
        } else {
            i = 0;
        }
        int i4 = gdjVar.f;
        if (i4 != Integer.MIN_VALUE) {
            i2 = i4;
        } else {
            i2 = 0;
        }
        if (i3 != Integer.MIN_VALUE && i4 != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        gcmVar2.b = i;
        gcmVar2.a.clear();
        gcmVar2.a.add(gdjVar);
        gcmVar2.c = i2;
        gcmVar2.d = 0;
        gcmVar2.f = gdjVar.b.size();
        gcmVar2.e = z;
        gcmVar2.g = gdjVar.b.size() / 2;
        n(0, gcmVar2.f());
        gcm gcmVar3 = this.h;
        if (gcmVar3.b <= 0) {
            int i5 = gcmVar3.c;
        }
    }

    @Override // defpackage.gcj
    public final gdk a() {
        return this.l;
    }

    @Override // defpackage.gcj
    public final Object b() {
        gdl gdlVar;
        Object a;
        akrq akrqVar = this.k;
        akrqVar.getClass();
        gcm gcmVar = this.h;
        if (gcmVar.a.isEmpty()) {
            gdlVar = null;
        } else {
            gdlVar = new gdl(aqjn.ax(gcmVar.a), Integer.valueOf(gcmVar.b()), new gcn(akrqVar.b, akrqVar.c, true, akrqVar.a, Integer.MAX_VALUE, 0, 32), gcmVar.b);
        }
        if (gdlVar != null && (a = this.l.a(gdlVar)) != null) {
            return a;
        }
        return this.m;
    }

    @Override // defpackage.gcj
    public final void c(arqv arqvVar) {
        gch gchVar = (gch) this.e.h;
        arqvVar.a(gbb.REFRESH, gchVar.b);
        arqvVar.a(gbb.PREPEND, gchVar.c);
        arqvVar.a(gbb.APPEND, gchVar.d);
    }

    @Override // defpackage.gcj
    public final void d(int i) {
        gcm gcmVar = this.h;
        int i2 = this.k.c;
        int i3 = gcmVar.b;
        int i4 = i2 - (i - i3);
        int i5 = i3 + gcmVar.f;
        int i6 = i2 + i;
        int max = Math.max(i4, this.a);
        this.a = max;
        if (max > 0) {
            rae raeVar = this.e;
            gaz gazVar = ((gch) raeVar.h).c;
            if ((gazVar instanceof gay) && !gazVar.c) {
                raeVar.g();
            }
        }
        int max2 = Math.max((i6 + 1) - i5, this.b);
        this.b = max2;
        if (max2 > 0) {
            rae raeVar2 = this.e;
            gaz gazVar2 = ((gch) raeVar2.h).d;
            if ((gazVar2 instanceof gay) && !gazVar2.c) {
                raeVar2.f();
            }
        }
        this.c = Math.min(this.c, i);
        this.d = Math.max(this.d, i);
    }

    @Override // defpackage.gcj
    public final void e(gbb gbbVar, gaz gazVar) {
        gbbVar.getClass();
        ((gch) this.e.h).b(gbbVar, gazVar);
    }

    @Override // defpackage.gcj
    public final boolean f() {
        return this.e.h();
    }
}
