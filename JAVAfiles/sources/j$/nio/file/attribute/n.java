package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class n implements m {
    final /* synthetic */ FileAttribute a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.m
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.m
    public final Object value() {
        Object value;
        value = this.a.value();
        return Collections.unmodifiableSet(j$.nio.file.l.i((Set) value));
    }
}
