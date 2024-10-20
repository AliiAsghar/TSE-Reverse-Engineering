package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qsb implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qsb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v46, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((ryg) this.a).o((qei) obj);
            case 1:
                return ((qsa) this.a).c((qei) obj);
            case 2:
                return Long.valueOf(this.a.P("destinations", (ContentValues) obj));
            case 3:
                qsy qsyVar = (qsy) obj;
                alob alobVar = new alob();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    alobVar.h(String.valueOf(qta.e((qss) it.next())));
                }
                qsyVar.U(new agmf("destinations.token", 3, qsy.X(alobVar.g()), false));
                return qsyVar;
            case 4:
                snh snhVar = (snh) obj;
                snhVar.u((String) this.a);
                return snhVar;
            case 5:
                smo smoVar = (smo) obj;
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 6:
                snh snhVar2 = (snh) obj;
                snhVar2.u((String) this.a);
                return snhVar2;
            case 7:
                return Long.valueOf(this.a.P("my_identities", (ContentValues) obj));
            case 8:
                qwv qwvVar = (qwv) obj;
                int i = qwd.a;
                Object obj2 = this.a;
                obj2.getClass();
                qwvVar.c(((qxc) obj2).b);
                return qwvVar;
            case 9:
                qwv qwvVar2 = (qwv) obj;
                int i2 = qwd.a;
                Object obj3 = this.a;
                obj3.getClass();
                qxc qxcVar = (qxc) obj3;
                qwvVar2.d(qxcVar.a);
                qwvVar2.c(qxcVar.b);
                return qwvVar2;
            case 10:
                qvj qvjVar = (qvj) obj;
                int i3 = qwd.a;
                qvjVar.c(this.a);
                return qvjVar;
            case 11:
                int i4 = qwd.a;
                return this.a.a(obj);
            case 12:
                qvj qvjVar2 = (qvj) obj;
                int i5 = qwd.a;
                qvjVar2.U(new agmd("my_identities.phone_number", 1, String.valueOf(((qxc) this.a).a())));
                return qvjVar2;
            case 13:
                qvj qvjVar3 = (qvj) obj;
                int i6 = qwd.a;
                qvjVar3.c(this.a);
                return qvjVar3;
            case 14:
                qvz qvzVar = (qvz) obj;
                alob alobVar2 = new alob();
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    alobVar2.h(String.valueOf(riw.n((qwe) it2.next())));
                }
                qvzVar.U(new agmf("my_identities.token", 3, qvz.X(alobVar2.g()), false));
                return qvzVar;
            case 15:
                qvz qvzVar2 = (qvz) obj;
                qvzVar2.b((qwe) this.a);
                return qvzVar2;
            case 16:
                qvz qvzVar3 = (qvz) obj;
                qvzVar3.b((qwe) this.a);
                return qvzVar3;
            case 17:
                return d.V(this.a, obj);
            case 18:
                return d.V(this.a, obj);
            case 19:
                return this.a.k((msh) obj);
            default:
                return Long.valueOf(this.a.O("subscriptions", (ContentValues) obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
