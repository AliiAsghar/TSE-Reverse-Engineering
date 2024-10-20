package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class amdb {
    public abstract amda a(String str);

    public final Optional b(CharSequence charSequence) {
        return Optional.ofNullable(Objects.toString(a(charSequence.toString()), null));
    }
}
