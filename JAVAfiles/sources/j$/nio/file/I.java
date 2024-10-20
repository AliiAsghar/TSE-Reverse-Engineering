package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes5.dex */
public final /* synthetic */ class I {
    public final /* synthetic */ WatchEvent.Modifier a;

    private /* synthetic */ I(WatchEvent.Modifier modifier) {
        this.a = modifier;
    }

    public static /* synthetic */ I a(WatchEvent.Modifier modifier) {
        if (modifier == null) {
            return null;
        }
        return new I(modifier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
