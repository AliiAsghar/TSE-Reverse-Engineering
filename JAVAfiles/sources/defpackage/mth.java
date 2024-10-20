package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mth implements Function {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mth(long j, long j2, sxx sxxVar, int i) {
        this.d = i;
        this.a = j;
        this.b = j2;
        this.c = sxxVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, agpj] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                Object a = mvg.a.e.a((syc) obj, Long.valueOf(this.a));
                ((syc) a).i((MessageIdType) this.c);
                ((agpx) a).W(new agpk("$V{J:parts} < $V", new Object[]{PartsTable.d.a, Long.valueOf(this.b)}));
                return a;
            }
            sxk sxkVar = (sxk) obj;
            int i2 = man.b;
            sxkVar.b(this.a - this.b);
            sxkVar.W(new agov(this.c));
            return sxkVar;
        }
        Object a2 = mvg.a.e.a((syc) obj, Long.valueOf(this.a));
        ((syc) a2).i((MessageIdType) this.c);
        ((agpx) a2).W(new agpk("$V{J:parts} > $V", new Object[]{PartsTable.d.a, Long.valueOf(this.b)}));
        return a2;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ mth(long j, MessageIdType messageIdType, long j2, int i) {
        this.d = i;
        this.a = j;
        this.c = messageIdType;
        this.b = j2;
    }
}
