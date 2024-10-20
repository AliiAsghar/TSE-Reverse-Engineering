package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqvl implements aqvm {
    private final Object a;
    private final Object b;
    private final /* synthetic */ int c;

    public aqvl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.aqvm
    public final int a() {
        if (this.c != 0) {
            return ((Object[]) this.b).length;
        }
        return 1;
    }

    @Override // defpackage.aqvm
    public final aqvm c(Object obj, Object obj2, int i, int i2) {
        Object[] objArr;
        int length;
        int i3 = 0;
        if (this.c != 0) {
            int hashCode = ((Object[]) this.a)[0].hashCode();
            if (hashCode != i) {
                return aqvk.b(new aqvl(obj, obj2, 0), i, this, hashCode, i2);
            }
            while (true) {
                objArr = (Object[]) this.a;
                length = objArr.length;
                if (i3 < length) {
                    if (objArr[i3] == obj) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 != -1) {
                Object[] copyOf = Arrays.copyOf(objArr, length);
                Object[] copyOf2 = Arrays.copyOf((Object[]) this.b, ((Object[]) this.a).length);
                copyOf[i3] = obj;
                copyOf2[i3] = obj2;
                return new aqvl(copyOf, copyOf2, 1);
            }
            int i4 = length + 1;
            Object obj3 = this.b;
            Object[] copyOf3 = Arrays.copyOf(objArr, i4);
            Object obj4 = this.a;
            Object[] copyOf4 = Arrays.copyOf((Object[]) obj3, i4);
            copyOf3[((Object[]) obj4).length] = obj;
            copyOf4[((Object[]) this.a).length] = obj2;
            return new aqvl(copyOf3, copyOf4, 1);
        }
        int hashCode2 = this.a.hashCode();
        if (hashCode2 != i) {
            return aqvk.b(new aqvl(obj, obj2, 0), i, this, hashCode2, i2);
        }
        Object obj5 = this.a;
        if (obj5 == obj) {
            return new aqvl(obj, obj2, 0);
        }
        return new aqvl(new Object[]{obj5, obj}, new Object[]{this.b, obj2}, 1);
    }

    @Override // defpackage.aqvm
    public final Object d(Object obj, int i, int i2) {
        if (this.c != 0) {
            int i3 = 0;
            while (true) {
                Object[] objArr = (Object[]) this.a;
                if (i3 >= objArr.length) {
                    return null;
                }
                if (objArr[i3] == obj) {
                    return ((Object[]) this.b)[i3];
                }
                i3++;
            }
        } else {
            if (this.a != obj) {
                return null;
            }
            return this.b;
        }
    }

    public final String toString() {
        if (this.c != 0) {
            StringBuilder sb = new StringBuilder("CollisionLeaf(");
            for (int i = 0; i < ((Object[]) this.b).length; i++) {
                sb.append("(key=");
                sb.append(((Object[]) this.a)[i]);
                sb.append(" value=");
                sb.append(((Object[]) this.b)[i]);
                sb.append(") ");
            }
            sb.append(")");
            return sb.toString();
        }
        return String.format("Leaf(key=%s value=%s)", this.a, this.b);
    }
}
