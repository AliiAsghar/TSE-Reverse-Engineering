package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxo extends LinkedHashMap {
    private final int a = BasePaymentResult.ERROR_REQUEST_FAILED;

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        entry.getClass();
        if (super.size() > this.a) {
            return true;
        }
        return false;
    }
}
