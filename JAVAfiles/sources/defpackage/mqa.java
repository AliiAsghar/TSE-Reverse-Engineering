package defpackage;

import j$.util.DesugarArrays;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class mqa extends arrm implements arqr {
    public static final mqa a = new mqa();

    public mqa() {
        super(1, Arrays.class, "stream", "stream([Ljava/lang/Object;)Ljava/util/stream/Stream;", 0);
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        return DesugarArrays.stream((String[]) obj);
    }
}
