package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alsg extends alsi implements alqu {
    public alsg(alqu alquVar, alrs alrsVar) {
        super(alquVar, alrsVar);
    }

    @Override // defpackage.alsi, defpackage.alrz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection z(Object obj) {
        return a(obj, this.a.z(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.alsi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final List a(Object obj, Collection collection) {
        return alzz.as((List) collection, new alre(this.b, obj));
    }

    @Override // defpackage.alqu
    /* renamed from: d */
    public final List b(Object obj) {
        throw null;
    }
}
