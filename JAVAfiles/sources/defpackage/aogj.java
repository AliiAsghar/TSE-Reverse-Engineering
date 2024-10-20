package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aogj implements aoga {
    private final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aofx
    public final void a(Object obj, Object obj2) {
        if (this.a != 0) {
            Map.Entry entry = (Map.Entry) obj;
            obj2.b(aogi.a, entry.getKey());
            obj2.b(aogi.b, entry.getValue());
            return;
        }
        throw new aofy("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
    }
}
