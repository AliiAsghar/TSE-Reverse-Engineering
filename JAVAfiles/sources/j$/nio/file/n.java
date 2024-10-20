package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements p {
    public final /* synthetic */ OpenOption a;

    private /* synthetic */ n(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.p, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.LinkOption, j$.nio.file.p] */
    public static /* synthetic */ p a(OpenOption openOption) {
        ?? r1;
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof o) {
            return ((o) openOption).a;
        }
        if (openOption instanceof m) {
            r1 = LinkOption.NOFOLLOW_LINKS;
            return r1;
        }
        if (openOption instanceof D) {
            return l.b((D) openOption);
        }
        return new n(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof n) {
            obj = ((n) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
