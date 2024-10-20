package j$.nio.file;

import java.nio.file.LinkOption;

/* renamed from: j$.nio.file.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0061c implements java.nio.file.CopyOption {
    public final /* synthetic */ CopyOption a;

    private /* synthetic */ C0061c(CopyOption copyOption) {
        this.a = copyOption;
    }

    public static /* synthetic */ java.nio.file.CopyOption a(CopyOption copyOption) {
        java.nio.file.StandardCopyOption standardCopyOption;
        java.nio.file.StandardCopyOption standardCopyOption2;
        java.nio.file.StandardCopyOption standardCopyOption3;
        LinkOption linkOption;
        if (copyOption == null) {
            return null;
        }
        if (copyOption instanceof C0060b) {
            return ((C0060b) copyOption).a;
        }
        if (copyOption instanceof m) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            return linkOption;
        }
        if (copyOption instanceof StandardCopyOption) {
            StandardCopyOption standardCopyOption4 = (StandardCopyOption) copyOption;
            if (standardCopyOption4 == StandardCopyOption.REPLACE_EXISTING) {
                standardCopyOption3 = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
                return standardCopyOption3;
            }
            if (standardCopyOption4 == StandardCopyOption.COPY_ATTRIBUTES) {
                standardCopyOption2 = java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
                return standardCopyOption2;
            }
            standardCopyOption = java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            return standardCopyOption;
        }
        return new C0061c(copyOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.a;
        if (obj instanceof C0061c) {
            obj = ((C0061c) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
