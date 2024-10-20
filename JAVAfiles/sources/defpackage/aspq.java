package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspq extends IOException {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aspq(int i) {
        super("stream was reset: ".concat(aotl.ab(i)));
        Objects.toString(aotl.ab(i));
        this.a = i;
    }
}
