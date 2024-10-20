package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wa implements cue {
    public final AnimatedContentTransitionScopeImpl a;

    /* compiled from: PG */
    /* renamed from: wa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc[] a;
        final /* synthetic */ wa b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc[] cvcVarArr, wa waVar, int i, int i2) {
            super(1);
            this.a = cvcVarArr;
            this.b = waVar;
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a aVar = (cvc.a) obj;
            int i = 0;
            while (true) {
                cvc[] cvcVarArr = this.a;
                if (i < cvcVarArr.length) {
                    cvc cvcVar = cvcVarArr[i];
                    if (cvcVar != null) {
                        long a = this.b.a.b.a((cvcVar.a << 32) | (cvcVar.b & 4294967295L), (this.d & 4294967295L) | (this.c << 32), drk.a);
                        aVar.e(cvcVar, dre.a(a), dre.b(a), brg.a);
                    }
                    i++;
                } else {
                    return arnb.a;
                }
            }
        }
    }

    public wa(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.a = animatedContentTransitionScopeImpl;
    }

    @Override // defpackage.cue
    public final int a(ctd ctdVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ctc) list.get(0)).a(i));
            int z = aqjn.z(list);
            if (z > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ctc) list.get(i2)).a(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == z) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.cue
    public final int b(ctd ctdVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ctc) list.get(0)).b(i));
            int z = aqjn.z(list);
            if (z > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ctc) list.get(i2)).b(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == z) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.cue
    public final int c(ctd ctdVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ctc) list.get(0)).c(i));
            int z = aqjn.z(list);
            if (z > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ctc) list.get(i2)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == z) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.cue
    public final int d(ctd ctdVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ctc) list.get(0)).d(i));
            int z = aqjn.z(list);
            if (z > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ctc) list.get(i2)).d(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == z) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        cvc cvcVar;
        int i;
        int i2;
        int i3;
        int i4;
        cvc cvcVar2;
        int i5;
        int i6;
        int i7;
        cuf et;
        AnimatedContentTransitionScopeImpl.a aVar;
        int size = list.size();
        cvc[] cvcVarArr = new cvc[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            cuc cucVar = (cuc) list.get(i8);
            Object f = cucVar.f();
            if (f instanceof AnimatedContentTransitionScopeImpl.a) {
                aVar = (AnimatedContentTransitionScopeImpl.a) f;
            } else {
                aVar = null;
            }
            if (aVar != null && ((Boolean) aVar.a.a()).booleanValue()) {
                cvcVarArr[i8] = cucVar.e(j);
                j2 = (r7.a << 32) | (r7.b & 4294967295L);
            }
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            cuc cucVar2 = (cuc) list.get(i9);
            if (cvcVarArr[i9] == null) {
                cvcVarArr[i9] = cucVar2.e(j);
            }
        }
        if (cuhVar.ev()) {
            i3 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                cvcVar = null;
            } else {
                cvcVar = cvcVarArr[0];
                int i10 = aqil.i(cvcVarArr);
                if (i10 != 0) {
                    if (cvcVar != null) {
                        i = cvcVar.a;
                    } else {
                        i = 0;
                    }
                    arob it = new artb(1, i10).iterator();
                    while (it.a) {
                        cvc cvcVar3 = cvcVarArr[it.a()];
                        if (cvcVar3 != null) {
                            i2 = cvcVar3.a;
                        } else {
                            i2 = 0;
                        }
                        if (i < i2) {
                            cvcVar = cvcVar3;
                            i = i2;
                        }
                    }
                }
            }
            if (cvcVar != null) {
                i3 = cvcVar.a;
            } else {
                i3 = 0;
            }
        }
        if (cuhVar.ev()) {
            i7 = (int) (j2 & 4294967295L);
        } else {
            if (size == 0) {
                i4 = 0;
                cvcVar2 = null;
            } else {
                i4 = 0;
                cvcVar2 = cvcVarArr[0];
                int i11 = aqil.i(cvcVarArr);
                if (i11 != 0) {
                    if (cvcVar2 != null) {
                        i5 = cvcVar2.b;
                    } else {
                        i5 = 0;
                    }
                    arob it2 = new artb(1, i11).iterator();
                    while (it2.a) {
                        cvc cvcVar4 = cvcVarArr[it2.a()];
                        if (cvcVar4 != null) {
                            i6 = cvcVar4.b;
                        } else {
                            i6 = 0;
                        }
                        if (i5 < i6) {
                            cvcVar2 = cvcVar4;
                            i5 = i6;
                        }
                    }
                }
            }
            if (cvcVar2 != null) {
                i7 = cvcVar2.b;
            } else {
                i7 = i4;
            }
        }
        if (!cuhVar.ev()) {
            this.a.c.h(new dri((i3 << 32) | (i7 & 4294967295L)));
        }
        et = cuhVar.et(i3, i7, arnw.a, new AnonymousClass1(cvcVarArr, this, i3, i7));
        return et;
    }
}
