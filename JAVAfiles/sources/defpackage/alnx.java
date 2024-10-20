package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alnx extends alom {
    private final transient EnumMap a;

    public alnx(EnumMap enumMap) {
        this.a = enumMap;
        d.s(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.alom
    public final aluq a() {
        return new alrm(this.a.entrySet().iterator());
    }

    @Override // defpackage.alor, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.alor, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alnx) {
            obj = ((alnx) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.alor
    public final aluq gX() {
        return alzz.ax(this.a.keySet().iterator());
    }

    @Override // defpackage.alor
    public final boolean gY() {
        return false;
    }

    @Override // defpackage.alor, java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.alom, defpackage.alor
    public Object writeReplace() {
        return new alnw(this.a);
    }
}
