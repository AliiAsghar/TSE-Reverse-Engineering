package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkr extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ascv[] c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkr(arpe arpeVar, ascv[] ascvVarArr, arqw arqwVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = ascvVarArr;
        this.d = arqwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r1v3, types: [arqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [arqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [arqx, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    qkr qkrVar = new qkr((arpe) obj3, this.c, (arqy) this.d, 3);
                    qkrVar.e = (asaj) obj;
                    qkrVar.b = (Object[]) obj2;
                    return qkrVar.b(arnb.a);
                }
                qkr qkrVar2 = new qkr((arpe) obj3, this.c, (arqx) this.d, 2);
                qkrVar2.e = (asaj) obj;
                qkrVar2.b = (Object[]) obj2;
                return qkrVar2.b(arnb.a);
            }
            qkr qkrVar3 = new qkr((arpe) obj3, this.c, (arqz) this.d, 1);
            qkrVar3.e = (asaj) obj;
            qkrVar3.b = (Object[]) obj2;
            return qkrVar3.b(arnb.a);
        }
        qkr qkrVar4 = new qkr((arpe) obj3, this.c, (arqw) this.d, 0);
        qkrVar4.e = (asaj) obj;
        qkrVar4.b = (Object[]) obj2;
        return qkrVar4.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [arqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [arqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r7v1, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [arqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [asaj, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        Object obj5;
        int i5 = this.f;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    arpl arplVar = arpl.a;
                    int i6 = this.a;
                    aqil.P(obj);
                    if (i6 == 0) {
                        ?? r9 = this.e;
                        Object obj6 = this.b;
                        ascv[] ascvVarArr = this.c;
                        ArrayList arrayList = new ArrayList(5);
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < 5) {
                            if (ascvVarArr[i7] != null) {
                                i4 = i8 + 1;
                                obj5 = ((Object[]) obj6)[i8];
                            } else {
                                i4 = i8;
                                obj5 = null;
                            }
                            arrayList.add(obj5);
                            i7++;
                            i8 = i4;
                        }
                        Object[] array = arrayList.toArray(new Object[0]);
                        Object f = this.d.f(array[0], array[1], array[2], array[3], array[4]);
                        this.a = 1;
                        if (r9.fv(f, this) == arplVar) {
                            return arplVar;
                        }
                    }
                    return arnb.a;
                }
                arpl arplVar2 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    ?? r7 = this.e;
                    Object obj7 = this.b;
                    ascv[] ascvVarArr2 = this.c;
                    ArrayList arrayList2 = new ArrayList(4);
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < 4) {
                        if (ascvVarArr2[i9] != null) {
                            i3 = i10 + 1;
                            obj4 = ((Object[]) obj7)[i10];
                        } else {
                            i3 = i10;
                            obj4 = null;
                        }
                        arrayList2.add(obj4);
                        i9++;
                        i10 = i3;
                    }
                    Object[] array2 = arrayList2.toArray(new Object[0]);
                    Object a = this.d.a(array2[0], array2[1], array2[2], array2[3]);
                    this.a = 1;
                    if (r7.fv(a, this) == arplVar2) {
                        return arplVar2;
                    }
                }
                return arnb.a;
            }
            arpl arplVar3 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                ?? r92 = this.e;
                Object obj8 = this.b;
                ascv[] ascvVarArr3 = this.c;
                ArrayList arrayList3 = new ArrayList(6);
                int i11 = 0;
                int i12 = 0;
                while (i11 < 6) {
                    if (ascvVarArr3[i11] != null) {
                        i2 = i12 + 1;
                        obj3 = ((Object[]) obj8)[i12];
                    } else {
                        i2 = i12;
                        obj3 = null;
                    }
                    arrayList3.add(obj3);
                    i11++;
                    i12 = i2;
                }
                Object[] array3 = arrayList3.toArray(new Object[0]);
                Object a2 = this.d.a(array3[0], array3[1], array3[2], array3[3], array3[4], array3[5]);
                this.a = 1;
                if (r92.fv(a2, this) == arplVar3) {
                    return arplVar3;
                }
            }
            return arnb.a;
        }
        arpl arplVar4 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            ?? r72 = this.e;
            Object obj9 = this.b;
            ascv[] ascvVarArr4 = this.c;
            ArrayList arrayList4 = new ArrayList(3);
            int i13 = 0;
            int i14 = 0;
            while (i13 < 3) {
                if (ascvVarArr4[i13] != null) {
                    i = i14 + 1;
                    obj2 = ((Object[]) obj9)[i14];
                } else {
                    i = i14;
                    obj2 = null;
                }
                arrayList4.add(obj2);
                i13++;
                i14 = i;
            }
            Object[] array4 = arrayList4.toArray(new Object[0]);
            Object a3 = this.d.a(array4[0], array4[1], array4[2]);
            this.a = 1;
            if (r72.fv(a3, this) == arplVar4) {
                return arplVar4;
            }
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkr(arpe arpeVar, ascv[] ascvVarArr, arqx arqxVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = ascvVarArr;
        this.d = arqxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkr(arpe arpeVar, ascv[] ascvVarArr, arqy arqyVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = ascvVarArr;
        this.d = arqyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkr(arpe arpeVar, ascv[] ascvVarArr, arqz arqzVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = ascvVarArr;
        this.d = arqzVar;
    }
}
