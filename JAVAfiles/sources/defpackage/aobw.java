package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aobw extends ThreadLocal {
    final /* synthetic */ aobx a;

    public aobw(aobx aobxVar) {
        this.a = aobxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) aobo.b.a(this.a.a);
            mac.init(this.a.b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
