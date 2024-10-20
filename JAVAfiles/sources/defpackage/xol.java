package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xol implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xol(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v25, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [android.text.Spannable, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        boolean z = false;
        switch (this.b) {
            case 0:
                xow xowVar = (xow) obj;
                alwl alwlVar = (alwl) xom.a.g();
                MessagesTable.BindData bindData = (MessagesTable.BindData) this.a;
                alwlVar.X(ydl.a, bindData.A().a());
                alwlVar.X(ydl.e, bindData.D().b);
                alwlVar.X(xod.a, xowVar.p());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/RcsFileTransferProgressCallbackAdapter", "getVerifiedTransferId", 115, "RcsFileTransferProgressCallbackAdapter.java")).q("Unverified transfer ID is verified as the RCS message ID.");
                return xowVar.p();
            case 1:
                syc sycVar = (syc) obj;
                sycVar.z(rve.a((String) this.a));
                return sycVar;
            case 2:
                xpe xpeVar = (xpe) obj;
                alwo alwoVar = xot.a;
                xpeVar.c((String) this.a);
                return xpeVar;
            case 3:
                syc sycVar2 = (syc) obj;
                alwo alwoVar2 = xot.a;
                sycVar2.f((ConversationIdType) this.a);
                sycVar2.w(3);
                sycVar2.O(qkv.d);
                return sycVar2;
            case 4:
                return ((xot) this.a).a(((MessagesTable.BindData) obj).A());
            case 5:
                syc sycVar3 = (syc) obj;
                alwo alwoVar3 = xot.a;
                sycVar3.f((ConversationIdType) this.a);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 10004) {
                    agnc.t("rcs_file_transfer_session_id", intValue);
                }
                sycVar3.U(new agoi("messages.rcs_file_transfer_session_id", 2, -1L));
                return sycVar3;
            case 6:
                return Long.valueOf(this.a.O("file_transfer", (ContentValues) obj));
            case 7:
                xpe xpeVar2 = (xpe) obj;
                alwo alwoVar4 = xru.a;
                xpeVar2.b(((MessageCoreData) ((Optional) this.a).get()).B());
                return xpeVar2;
            case 8:
                return this.a.a(obj);
            case 9:
                stk stkVar = (stk) obj;
                xze xzeVar = xwj.a;
                stkVar.c(this.a.B());
                stkVar.U(new agoi("messages_annotations.annotation_type", 1, 1));
                return stkVar;
            case 10:
                tbd tbdVar = (tbd) obj;
                alwo alwoVar5 = xxh.a;
                tbdVar.l((String) this.a);
                tbdVar.q(-2);
                return tbdVar;
            case 11:
                snh snhVar = (snh) obj;
                snhVar.j((ConversationIdType) this.a);
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 32000) {
                    agnc.t("cms_id", intValue2);
                }
                snhVar.U(new agmg("conversations.cms_id", 5));
                return snhVar;
            case 12:
                tcy tcyVar = (tcy) obj;
                uuf uufVar = xzk.a;
                tcyVar.U(new agmd("pii_hash.hash_key", 1, String.valueOf(this.a.toString())));
                return tcyVar;
            case 13:
                return ((yab) this.a).submit((Callable) obj);
            case 14:
                return Boolean.valueOf(((yav) this.a).p(((Integer) obj).intValue()));
            case 15:
                Object obj2 = this.a;
                return ((yyt) ((ybg) obj2).c.b()).B(new ybf(obj2, 0 == true ? 1 : 0), ((Integer) obj).intValue());
            case 16:
                Object obj3 = this.a;
                return ((yyt) ((ybg) obj3).c.b()).B(new ybf(obj3, 0 == true ? 1 : 0), ((Integer) obj).intValue());
            case 17:
                ekb ekbVar = (ekb) obj;
                alvi alviVar = ydc.a;
                ?? r0 = this.a;
                int spanStart = r0.getSpanStart(ekbVar);
                int spanEnd = r0.getSpanEnd(ekbVar);
                if (spanStart < spanEnd) {
                    z = true;
                }
                albo.T(z);
                return new ydb(spanStart, spanEnd);
            case 18:
                tga tgaVar = (tga) obj;
                tgaVar.b(((tfr) this.a).k());
                return tgaVar;
            case 19:
                tga tgaVar2 = (tga) obj;
                tgaVar2.b(((tfr) this.a).k());
                return tgaVar2;
            default:
                tga tgaVar3 = (tga) obj;
                tgaVar3.b((Uri) this.a);
                return tgaVar3;
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
