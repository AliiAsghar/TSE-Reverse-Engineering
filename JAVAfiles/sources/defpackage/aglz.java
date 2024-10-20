package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import android.text.TextUtils;
import defpackage.aglz;
import defpackage.agmh;
import defpackage.agmq;
import defpackage.agoz;
import defpackage.agpc;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aglz<C extends agmq<C, Q, B, D, R>, Q extends agoz<C, Q, B, D, R>, B extends agpc<C, Q, B, D, R>, D extends aglz<C, Q, B, D, R>, R extends agmh<R>> {
    public BitSet cE;
    public Map cF;
    public final Map cG = new HashMap();
    public final Map cH = new HashMap();
    public boolean cI;
    protected aday cJ;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        akip QY();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String aA(String[] strArr) {
        return TextUtils.join(";", strArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String aB(boolean[] zArr) {
        StringBuilder sb = new StringBuilder();
        for (boolean z : zArr) {
            sb.append(z);
            sb.append(";");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean aw(agmp agmpVar, int i) {
        return agmpVar.db(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String ax(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(i);
            sb.append(";");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String ay(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        for (long j : jArr) {
            sb.append(j);
            sb.append(";");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String az(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(";");
        }
        return sb.toString();
    }

    private final aglz fF(String str, Class cls) {
        if (((agoa) this.cH.get(str)) != null) {
            alog alogVar = (alog) this.cG.get(str);
            boolean z = true;
            if (alogVar.size() > 1) {
                return (aglz) cls.cast(alogVar.get(1));
            }
            if (cls.cast(alogVar.get(0)) == null) {
                z = false;
            }
            albo.T(z);
            return null;
        }
        throw new IllegalArgumentException("invalid join tag: " + str + ", valid joins=" + Arrays.toString(this.cH.keySet().toArray()));
    }

    public abstract String a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    public final boolean aC(aday adayVar) {
        int size;
        int size2;
        aday adayVar2 = this.cJ;
        if (adayVar2 == null) {
            size = 0;
        } else {
            size = adayVar2.a.size();
        }
        if (adayVar == null) {
            size2 = 0;
        } else {
            size2 = adayVar.a.size();
        }
        if (size != size2) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        return this.cJ.equals(adayVar);
    }

    public final aglz al(String str, Class cls) {
        agoa agoaVar = (agoa) this.cH.get(str);
        if (agoaVar != null && agoaVar.f) {
            throw new IllegalArgumentException("invalid join tag (found multi row join): " + str + "; join " + agoaVar.toString());
        }
        return fF(str, cls);
    }

    public final Object am(String str) {
        Map map = this.cF;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.lang.Object] */
    public final String an(String str) {
        Integer num = (Integer) this.cJ.b.get(str);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue < this.cJ.X() && intValue >= 0) {
                return (String) this.cJ.a.get(intValue);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("unknown as expression: ".concat(String.valueOf(str)));
    }

    public final void ao(int i, String str) {
        Object obj;
        BitSet bitSet;
        obj = agnc.c.a.get();
        if (((Boolean) obj).booleanValue() && (bitSet = this.cE) != null && !bitSet.get(i)) {
            throw new IllegalStateException(defpackage.a.bW(str, "sql column ", " is not part of the projection or was not initialized in the builder"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public final void ap(Parcel parcel) {
        aday adayVar = new aday(alog.n(Arrays.asList(parcel.createStringArray())), new HashMap());
        this.cJ = adayVar;
        parcel.readMap(adayVar.b, null);
        fo(parcel);
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.cE = null;
            return;
        }
        this.cE = new BitSet();
        for (int i = 0; i < readInt; i++) {
            this.cE.set(parcel.readInt());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aq() {
        if (this.cE != null) {
            return;
        }
        this.cE = new BitSet();
    }

    public final void ar(BitSet bitSet) {
        BitSet bitSet2;
        if (bitSet != null) {
            bitSet2 = (BitSet) bitSet.clone();
        } else {
            bitSet2 = null;
        }
        this.cE = bitSet2;
    }

    public final boolean as(String str) {
        return this.cH.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final boolean at(String str) {
        aday adayVar = this.cJ;
        if (adayVar != null && adayVar.b.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final aglz[] au(String str, aglz[] aglzVarArr) {
        if (this.cH.containsKey(str)) {
            alog alogVar = (alog) this.cG.get(str);
            if (alogVar.size() > 0) {
                aglzVarArr = (aglz[]) Array.newInstance(aglzVarArr.getClass().getComponentType(), alogVar.size() - 1);
            }
            System.arraycopy(alogVar.toArray(), 1, aglzVarArr, 0, alogVar.size() - 1);
            return aglzVarArr;
        }
        throw new IllegalArgumentException("invalid join tag: " + str + ", valid joins=" + Arrays.toString(this.cH.keySet().toArray()));
    }

    public final aglz av(Class cls) {
        if (!this.cI) {
            return fF("contacts_table_join_tag", cls);
        }
        throw new IllegalArgumentException("invalid join tag (found aggregating query): contacts_table_join_tag; join ".concat(String.valueOf(String.valueOf(this.cH.get("contacts_table_join_tag")))));
    }

    public abstract void b(ContentValues contentValues);

    public abstract void c(agmq agmqVar);

    public void fE(int i) {
        BitSet bitSet = this.cE;
        if (bitSet != null) {
            bitSet.set(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map, java.lang.Object] */
    public final void writeToParcel(Parcel parcel, int i) {
        aday adayVar = this.cJ;
        if (adayVar == null) {
            parcel.writeStringArray(new String[0]);
            parcel.writeMap(new HashMap());
        } else {
            parcel.writeStringArray((String[]) adayVar.a.toArray(new String[0]));
            parcel.writeMap(this.cJ.b);
        }
        fp(parcel);
        BitSet bitSet = this.cE;
        if (bitSet == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bitSet.cardinality());
        int nextSetBit = this.cE.nextSetBit(0);
        while (nextSetBit != -1) {
            parcel.writeInt(nextSetBit);
            nextSetBit = this.cE.nextSetBit(nextSetBit + 1);
        }
    }

    protected void fo(Parcel parcel) {
    }

    protected void fp(Parcel parcel) {
    }
}
