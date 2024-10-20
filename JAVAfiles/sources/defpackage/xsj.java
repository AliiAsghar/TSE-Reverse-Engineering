package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xsj implements ancv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xsj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r12v4, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v53, types: [java.lang.Object, aixs] */
    /* JADX WARN: Type inference failed for: r12v63, types: [java.lang.Object, akfb] */
    /* JADX WARN: Type inference failed for: r13v40, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ancv
    public final andc a(ahmn ahmnVar, Object obj) {
        andc e;
        aixe aixeVar;
        byte[] bArr = null;
        boolean z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                apus apusVar = (apus) obj;
                alwo alwoVar = xsl.a;
                apusVar.getClass();
                if (apusVar.e() == -1) {
                    z = false;
                }
                d.t(z, "DataStream is unknown size.");
                return new andc((ListenableFuture) this.a.apply(apusVar));
            case 1:
                Cursor cursor = (Cursor) obj;
                akul ag = aktp.ag(null);
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    if (!albo.ah(string)) {
                        xhv b = xhv.b(cursor.getLong(1));
                        if (!b.d()) {
                            Object obj2 = this.a;
                            qri qriVar = (qri) obj2;
                            ConversationIdType m = ((rtz) qriVar.d.b()).m(b);
                            if (m.b()) {
                                Log.w("Bugle", "ConversationMatchingLogger found null baseline conversation");
                            } else {
                                ag = ag.i(new qdl(obj2, string, 8), qriVar.f).i(new qbt(obj2, (Object) m, (Object) string, 6, (byte[]) null), qriVar.f);
                            }
                        }
                    }
                }
                return new andc(ag);
            case 2:
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    Object obj3 = this.a;
                    alvw i2 = yin.a.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 619, "SmartSuggestionConfigUtils.java")).t("Null fileInputStream for file: %s", albo.g((alcs) obj3));
                    int i3 = alog.d;
                    return new andc(aktp.ag(alsx.a));
                }
                return new andc(aktp.ag(((aldb) apag.parseFrom(aldb.a, inputStream, aozs.a())).b));
            case 3:
                Object obj4 = this.a;
                return new andc(aktp.ai(new yxs(obj4, (List) obj, 9, bArr), ((zls) obj4).b.e));
            case 4:
                Optional optional = (Optional) obj;
                boolean isPresent = optional.isPresent();
                Object obj5 = this.a;
                if (isPresent) {
                    optional.getClass();
                    return new andc(aktp.ai(new ytr(optional, 5), ((zls) obj5).b.e));
                }
                final zls zlsVar = (zls) obj5;
                if (!zlsVar.b.d.r()) {
                    e = new andc(aktp.ag(new ArrayList()));
                } else {
                    andc h = zlsVar.b.h.h(zlt.a, new String[0], null, null, null);
                    final int i4 = zlsVar.a;
                    e = h.e(akto.e(new ancv() { // from class: zlr
                        @Override // defpackage.ancv
                        public final andc a(ahmn ahmnVar2, Object obj6) {
                            int i5 = i4;
                            zls zlsVar2 = zls.this;
                            return new andc(aktp.ai(new mjw(zlsVar2, (Cursor) obj6, i5, 6), zlsVar2.b.e));
                        }
                    }), zlsVar.b.e);
                }
                return new andc(akul.g(e.l()));
            case 5:
                ahmnVar.getClass();
                return (andc) this.a.a(ahmnVar, obj);
            case 6:
                aixe aixeVar2 = (aixe) obj;
                aixeVar2.b();
                agrk agrkVar = (agrk) this.a;
                aixa aixaVar = new aixa(aixeVar2, (Object[]) agrkVar.b, (String) agrkVar.a);
                int i5 = aixm.a;
                aixk aixkVar = new aixk(aixaVar);
                aixkVar.e(aixeVar2.b);
                return andc.a(aixkVar, andi.a);
            case 7:
                agrk agrkVar2 = (agrk) this.a;
                Object obj6 = agrkVar2.b;
                Object obj7 = agrkVar2.a;
                aixe aixeVar3 = (aixe) obj;
                akrh e2 = aktp.e("ExecSQL: ".concat((String) obj7));
                try {
                    xqt xqtVar = new xqt(aixeVar3, obj7, obj6, 20, (byte[]) null);
                    aixeVar3.b();
                    anel anelVar = new anel(akto.k(new ahes(aixeVar3, xqtVar, 10)));
                    aixeVar3.b.execute(anelVar);
                    e2.b(anelVar);
                    e2.close();
                    return new andc(anelVar);
                } catch (Throwable th) {
                    try {
                        e2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 8:
                return new andc(((aixe) obj).a(this.a));
            case 9:
                return new andc(((aixe) obj).a(new aiwz(this.a, i)));
            case 10:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                boolean isWriteAheadLoggingEnabled = sQLiteDatabase.isWriteAheadLoggingEnabled();
                aixj aixjVar = (aixj) this.a;
                Executor executor = aixjVar.i;
                if (isWriteAheadLoggingEnabled) {
                    aixeVar = new aixe(sQLiteDatabase, aixjVar.c, executor, aixjVar.p);
                } else {
                    aixeVar = new aixe(sQLiteDatabase, executor, executor, aixjVar.p);
                }
                return aixj.a(albo.bI(aixeVar), new ucz(aixeVar, 11));
            case 11:
                return new andc(this.a);
            default:
                return ansy.m(this.a, "Second load");
        }
    }
}
