package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwo extends arpw implements arqw {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwo(arpe arpeVar, int i) {
        super(3, arpeVar);
        this.c = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                jwo jwoVar = new jwo((arpe) obj3, 2, (char[]) null);
                jwoVar.a = booleanValue;
                jwoVar.b = booleanValue2;
                return jwoVar.b(arnb.a);
            }
            boolean booleanValue3 = ((Boolean) obj).booleanValue();
            boolean booleanValue4 = ((Boolean) obj2).booleanValue();
            jwo jwoVar2 = new jwo((arpe) obj3, 1, (byte[]) null);
            jwoVar2.a = booleanValue3;
            jwoVar2.b = booleanValue4;
            return jwoVar2.b(arnb.a);
        }
        boolean booleanValue5 = ((Boolean) obj).booleanValue();
        boolean booleanValue6 = ((Boolean) obj2).booleanValue();
        jwo jwoVar3 = new jwo((arpe) obj3, 0);
        jwoVar3.a = booleanValue5;
        jwoVar3.b = booleanValue6;
        return jwoVar3.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.c;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                boolean z2 = this.a;
                boolean z3 = this.b;
                if (!z2 || z3) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            aqil.P(obj);
            boolean z4 = this.a;
            boolean z5 = this.b;
            if (!z4 || z5) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        aqil.P(obj);
        boolean z6 = this.a;
        boolean z7 = this.b;
        if (!z6 || z7) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwo(arpe arpeVar, int i, byte[] bArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwo(arpe arpeVar, int i, char[] cArr) {
        super(3, arpeVar);
        this.c = i;
    }
}
