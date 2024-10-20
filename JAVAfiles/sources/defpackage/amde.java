package defpackage;

import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amde extends amdg {
    final /* synthetic */ Stream a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amde(Stream stream, Function function, Function function2, Stream stream2) {
        super(stream, function, function2);
        this.a = stream2;
    }

    @Override // defpackage.amdg
    public final Stream a() {
        return this.a;
    }
}
