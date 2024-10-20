package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum alrq implements algk {
    KEY,
    VALUE;

    @Override // defpackage.algk
    public final /* synthetic */ Object apply(Object obj) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ((Map.Entry) obj).getValue();
            }
            throw null;
        }
        return ((Map.Entry) obj).getKey();
    }
}
