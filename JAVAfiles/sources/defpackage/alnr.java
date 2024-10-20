package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alnr extends alor implements Map, allp {
    private static final long serialVersionUID = 912559;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.allp
    public final /* bridge */ /* synthetic */ allp a() {
        throw null;
    }

    public abstract alnr b();

    @Override // defpackage.alor
    public final /* bridge */ /* synthetic */ alnu c() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.alor, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final alpt values() {
        return b().keySet();
    }

    @Override // defpackage.alor
    public Object writeReplace() {
        return new alnq(this);
    }
}
