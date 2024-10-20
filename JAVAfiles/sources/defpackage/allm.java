package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class allm extends alla implements altk {
    private static final long serialVersionUID = 7431625294878419160L;

    /* JADX INFO: Access modifiers changed from: protected */
    public allm(Map map) {
        super(map);
    }

    @Override // defpackage.alla
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.alla
    public final Collection c(Object obj, Collection collection) {
        return new alkz(this, obj, (Set) collection);
    }

    @Override // defpackage.altk
    /* renamed from: d */
    public final Set r() {
        return (Set) super.r();
    }

    @Override // defpackage.alla
    public final /* synthetic */ Collection g() {
        return Collections.emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alla
    public final Collection i(Collection collection) {
        return DesugarCollections.unmodifiableSet(collection);
    }

    @Override // defpackage.alli, defpackage.alrz
    public final /* bridge */ /* synthetic */ Collection r() {
        throw null;
    }

    @Override // defpackage.alla, defpackage.alrz
    public final Set z(Object obj) {
        return (Set) super.z(obj);
    }
}
