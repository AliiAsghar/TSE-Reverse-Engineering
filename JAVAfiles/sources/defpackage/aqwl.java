package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwl extends aqss {
    public Context a;
    private final aque b;

    static {
        try {
            try {
                try {
                    ((aqug) Class.forName("ariz").asSubclass(aqug.class).getConstructor(null).newInstance(null)).c();
                } catch (Exception e) {
                    Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
                }
            } catch (ClassCastException e2) {
                Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
            }
        } catch (ClassNotFoundException e3) {
            Log.w("AndroidChannelBuilder", "Failed to find OkHttpChannelProvider", e3);
        }
    }

    public aqwl(aque aqueVar) {
        this.b = aqueVar;
    }

    @Override // defpackage.aqsr, defpackage.aque
    public final aquc a() {
        return new aqwk(this.b.a(), this.a);
    }

    @Override // defpackage.aqss, defpackage.aqsr
    protected final aque b() {
        return this.b;
    }
}
