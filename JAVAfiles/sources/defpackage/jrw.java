package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrw extends arpw implements arqw {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrw(arpe arpeVar, int i) {
        super(3, arpeVar);
        this.c = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    jrw jrwVar = new jrw((arpe) obj3, 3, (short[]) null);
                    jrwVar.b = (gpx) obj;
                    jrwVar.a = booleanValue;
                    return jrwVar.b(arnb.a);
                }
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                jrw jrwVar2 = new jrw((arpe) obj3, 2, (char[]) null);
                jrwVar2.a = booleanValue2;
                jrwVar2.b = (wpn) obj2;
                return jrwVar2.b(arnb.a);
            }
            boolean booleanValue3 = ((Boolean) obj2).booleanValue();
            jrw jrwVar3 = new jrw((arpe) obj3, 1, (byte[]) null);
            jrwVar3.b = (moe) obj;
            jrwVar3.a = booleanValue3;
            return jrwVar3.b(arnb.a);
        }
        boolean booleanValue4 = ((Boolean) obj).booleanValue();
        jrw jrwVar4 = new jrw((arpe) obj3, 0);
        jrwVar4.a = booleanValue4;
        jrwVar4.b = (jhc) obj2;
        return jrwVar4.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.c;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    return new armo(this.b, Boolean.valueOf(this.a));
                }
                aqil.P(obj);
                boolean z2 = this.a;
                Object obj2 = this.b;
                if (z2 || obj2 == wpn.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            aqil.P(obj);
            Object obj3 = this.b;
            if (this.a || obj3 == moe.ON) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        aqil.P(obj);
        boolean z3 = this.a;
        Object obj4 = this.b;
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && z3 && !((jhc) obj4).a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrw(arpe arpeVar, int i, byte[] bArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrw(arpe arpeVar, int i, char[] cArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrw(arpe arpeVar, int i, short[] sArr) {
        super(3, arpeVar);
        this.c = i;
    }
}
