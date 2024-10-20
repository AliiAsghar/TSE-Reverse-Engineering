package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjv {
    public anix a;
    public byte b;
    private String c;
    private aqfn d;
    private aqfn e;
    private alob f;
    private alog g;
    private aqfn h;
    private int i;
    private int j;

    public final anjw a() {
        aqfn aqfnVar;
        alob alobVar = this.f;
        if (alobVar != null) {
            this.g = alobVar.g();
        } else if (this.g == null) {
            int i = alog.d;
            this.g = alsx.a;
        }
        int i2 = ~this.b;
        if ((i2 & 31) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" messageId");
            }
            if ((this.b & 2) == 0) {
                sb.append(" senderId");
            }
            if ((this.b & 4) == 0) {
                sb.append(" recipientId");
            }
            if ((this.b & 8) == 0) {
                sb.append(" messageType");
            }
            if ((this.b & 16) == 0) {
                sb.append(" messagePriority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        String str = this.c;
        aqfn aqfnVar2 = this.d;
        aqfn aqfnVar3 = this.e;
        int i3 = this.i;
        int i4 = this.j;
        alog alogVar = this.g;
        aqfn aqfnVar4 = this.h;
        anix anixVar = this.a;
        if ((i2 & 32) != 0) {
            int i5 = alog.d;
            alogVar = alsx.a;
        }
        anix anixVar2 = null;
        if ((i2 & 64) != 0) {
            aqfnVar = null;
        } else {
            aqfnVar = aqfnVar4;
        }
        if ((i2 & 128) == 0) {
            anixVar2 = anixVar;
        }
        return new anjw(str, aqfnVar2, aqfnVar3, i3, i4, alogVar, aqfnVar, anixVar2);
    }

    public final void b(Iterable iterable) {
        iterable.getClass();
        if (this.f == null) {
            if (this.g == null) {
                this.f = new alob();
                this.b = (byte) (this.b | 32);
            } else {
                alob alobVar = new alob();
                this.f = alobVar;
                alobVar.j(this.g);
                this.g = null;
            }
        }
        this.f.j(iterable);
    }

    public final void c(aqfn aqfnVar) {
        this.h = aqfnVar;
        this.b = (byte) (this.b | 64);
    }

    public final void d(String str) {
        if (str != null) {
            this.c = str;
            this.b = (byte) (this.b | 1);
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    public final void e(aqfn aqfnVar) {
        if (aqfnVar != null) {
            this.e = aqfnVar;
            this.b = (byte) (this.b | 4);
            return;
        }
        throw new NullPointerException("Null recipientId");
    }

    public final void f(aqfn aqfnVar) {
        if (aqfnVar != null) {
            this.d = aqfnVar;
            this.b = (byte) (this.b | 2);
            return;
        }
        throw new NullPointerException("Null senderId");
    }

    public final void g(int i) {
        this.j = i;
        this.b = (byte) (this.b | 16);
    }

    public final void h(int i) {
        this.i = i;
        this.b = (byte) (this.b | 8);
    }
}
