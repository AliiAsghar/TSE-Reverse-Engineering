package defpackage;

import j$.util.DesugarArrays;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class mqb extends arrm implements arqr {
    public static final mqb a = new mqb();

    public mqb() {
        super(1, Arrays.class, "stream", "stream([Ljava/lang/Object;)Ljava/util/stream/Stream;", 0);
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        return DesugarArrays.stream((String[]) obj);
    }
}
