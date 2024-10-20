package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qjz extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjz(arqr arqrVar, ascv ascvVar, int i) {
        super(0);
        this.c = i;
        this.a = arqrVar;
        this.b = ascvVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r2v4, types: [arqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [arqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [arqz, java.lang.Object] */
    @Override // defpackage.arqg
    public final Object a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ArrayList arrayList = new ArrayList(6);
                            for (int i2 = 0; i2 < 6; i2++) {
                                ascv ascvVar = ((ascv[]) this.b)[i2];
                                if (ascvVar != null) {
                                    obj4 = ascvVar.c();
                                } else {
                                    obj4 = null;
                                }
                                arrayList.add(obj4);
                            }
                            Object[] array = arrayList.toArray(new Object[0]);
                            return this.a.a(array[0], array[1], array[2], array[3], array[4], array[5]);
                        }
                        ArrayList arrayList2 = new ArrayList(5);
                        for (int i3 = 0; i3 < 5; i3++) {
                            ascv ascvVar2 = ((ascv[]) this.b)[i3];
                            if (ascvVar2 != null) {
                                obj3 = ascvVar2.c();
                            } else {
                                obj3 = null;
                            }
                            arrayList2.add(obj3);
                        }
                        Object[] array2 = arrayList2.toArray(new Object[0]);
                        return this.a.f(array2[0], array2[1], array2[2], array2[3], array2[4]);
                    }
                    ArrayList arrayList3 = new ArrayList(4);
                    for (int i4 = 0; i4 < 4; i4++) {
                        ascv ascvVar3 = ((ascv[]) this.b)[i4];
                        if (ascvVar3 != null) {
                            obj2 = ascvVar3.c();
                        } else {
                            obj2 = null;
                        }
                        arrayList3.add(obj2);
                    }
                    Object[] array3 = arrayList3.toArray(new Object[0]);
                    return this.a.a(array3[0], array3[1], array3[2], array3[3]);
                }
                ArrayList arrayList4 = new ArrayList(3);
                for (int i5 = 0; i5 < 3; i5++) {
                    ascv ascvVar4 = ((ascv[]) this.b)[i5];
                    if (ascvVar4 != null) {
                        obj = ascvVar4.c();
                    } else {
                        obj = null;
                    }
                    arrayList4.add(obj);
                }
                Object[] array4 = arrayList4.toArray(new Object[0]);
                return this.a.a(array4[0], array4[1], array4[2]);
            }
            return this.b.a(this.a);
        }
        return this.a.a(((qjr) this.b).b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjz(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
