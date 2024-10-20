package defpackage;

import defpackage.cee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cef implements cee {
    public final ve a;
    private final arqr b;
    private final ve c;

    public cef(Map map, arqr arqrVar) {
        ve veVar;
        this.b = arqrVar;
        if (map != null) {
            veVar = new ve(map.size());
            for (Map.Entry entry : map.entrySet()) {
                veVar.j(entry.getKey(), entry.getValue());
            }
        } else {
            veVar = new ve((byte[]) null);
        }
        this.c = veVar;
        this.a = new ve((byte[]) null);
    }

    @Override // defpackage.cee
    public final cee.a b(final String str, final arqg arqgVar) {
        bzc bzcVar = ceg.a;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!arro.g(str.charAt(i))) {
                ve veVar = this.a;
                Object a = veVar.a(str);
                if (a == null) {
                    a = new ArrayList();
                    veVar.j(str, a);
                }
                ((List) a).add(arqgVar);
                return new cee.a() { // from class: cef.1
                    @Override // cee.a
                    public final void a() {
                        List list = (List) cef.this.a.g(str);
                        if (list != null) {
                            list.remove(arqgVar);
                        }
                        if (list != null && !list.isEmpty()) {
                            cef cefVar = cef.this;
                            cefVar.a.j(str, list);
                        }
                    }
                };
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // defpackage.cee
    public final Object c(String str) {
        List list = (List) this.c.g(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            this.c.j(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // defpackage.cee
    public final Map d() {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        HashMap hashMap = new HashMap(this.c.e);
        ve veVar = this.c;
        Object[] objArr = veVar.b;
        Object[] objArr2 = veVar.c;
        long[] jArr3 = veVar.a;
        int length = jArr3.length - 2;
        char c = 7;
        long j = -9187201950435737472L;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr3[i4];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j2 & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            hashMap.put((String) objArr[i7], (List) objArr2[i7]);
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                j = -9187201950435737472L;
            }
        }
        ve veVar2 = this.a;
        Object[] objArr3 = veVar2.b;
        Object[] objArr4 = veVar2.c;
        long[] jArr4 = veVar2.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j3 = jArr4[i8];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j3 & 255) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = objArr3[i11];
                            List list = (List) objArr4[i11];
                            String str = (String) obj;
                            if (list.size() == 1) {
                                Object a = ((arqg) list.get(0)).a();
                                if (a != null) {
                                    if (g(a)) {
                                        hashMap.put(str, aqjn.A(a));
                                    } else {
                                        throw new IllegalStateException(cdy.a(a));
                                    }
                                }
                            } else {
                                int size = list.size();
                                ArrayList arrayList = new ArrayList(size);
                                int i12 = 0;
                                while (i12 < size) {
                                    long[] jArr5 = jArr4;
                                    Object a2 = ((arqg) list.get(i12)).a();
                                    if (a2 != null && !g(a2)) {
                                        throw new IllegalStateException(cdy.a(a2));
                                    }
                                    arrayList.add(a2);
                                    i12++;
                                    jArr4 = jArr5;
                                }
                                jArr2 = jArr4;
                                hashMap.put(str, arrayList);
                                i2 = 8;
                                j3 >>= i2;
                                i10++;
                                i3 = i2;
                                jArr4 = jArr2;
                            }
                        }
                        jArr2 = jArr4;
                        i2 = i3;
                        j3 >>= i2;
                        i10++;
                        i3 = i2;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    i = i3;
                    if (i9 != i) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    i = i3;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                i3 = i;
                jArr4 = jArr;
                c = 7;
            }
        }
        return hashMap;
    }

    @Override // defpackage.cee
    public final boolean g(Object obj) {
        return ((Boolean) this.b.a(obj)).booleanValue();
    }
}
