package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyw extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyw(Object obj, afzd afzdVar) {
        super(obj);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        Integer num;
        ayc aycVar = (ayc) obj2;
        aycVar.getClass();
        int i = aycVar.b;
        Integer num2 = null;
        if (a.bA(i, 1)) {
            num = 4096;
        } else if (a.bA(i, 2)) {
            num = 8192;
        } else if (a.bA(i, 3)) {
            num = 16384;
        } else {
            num = null;
        }
        afzd afzdVar = this.a;
        afzv.m(afzdVar, num);
        int i2 = aycVar.c;
        if (a.bA(i2, 1)) {
            num2 = 1;
        } else if (a.bA(i2, 3)) {
            num2 = 2;
        } else if (a.bA(i2, 4)) {
            num2 = 3;
        } else if (a.bA(i2, 5)) {
            num2 = 16;
        } else if (a.bA(i2, 6)) {
            num2 = 32;
        } else if (a.bA(i2, 7)) {
            num2 = 128;
        } else if (a.bA(i2, 8)) {
            num2 = 16;
        } else if (a.bA(i2, 9)) {
            num2 = 8194;
        }
        afzv.m(afzdVar, num2);
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
