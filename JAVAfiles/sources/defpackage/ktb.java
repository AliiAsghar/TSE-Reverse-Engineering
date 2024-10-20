package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ktb implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ktb(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ksw kswVar;
        SpannableString spannableString;
        String string;
        SpannableString spannableString2;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Boolean.valueOf(((zlt) this.c).d.h(this.a).B(this.b));
                }
                final int i2 = this.b;
                final int i3 = this.a;
                return ((kor) ((ifq) this.c).d).e("getContacts", new Function() { // from class: mjy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo416andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        sjl sjlVar = (sjl) obj;
                        sjk a = sjm.a();
                        a.w("pagingInnerQuery");
                        a.r();
                        a.d(new mfk(10));
                        tby tbyVar = sjm.e;
                        a.e(new atkn((agmh) tbyVar.f, (byte[]) null), new atkn((agmh) tbyVar.k, (byte[]) null));
                        a.x(i3);
                        a.u(i2);
                        sjlVar.U(new agme("contacts.contact_id", 3, a.b()));
                        return sjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
            hgi hgiVar = (hgi) this.c;
            int q = gvf.q((WorkDatabase) hgiVar.a, "next_job_scheduler_id");
            int i4 = this.a;
            if (i4 > q || q > this.b) {
                gvf.r((WorkDatabase) hgiVar.a, "next_job_scheduler_id", i4 + 1);
                q = i4;
            }
            return Integer.valueOf(q);
        }
        HashMap hashMap = new HashMap();
        sxy d = MessagesTable.d();
        d.w("getConversations");
        d.h(new atkn((Object) MessagesTable.c.i, false));
        d.u(this.a);
        sxt sxtVar = (sxt) d.b().n();
        Object obj = this.c;
        while (sxtVar.moveToNext()) {
            try {
                MessageCoreData a = ((tqx) ((ktc) obj).f.b()).a();
                a.cX(sxtVar);
                ConversationIdType z = a.z();
                if (!hashMap.containsKey(z)) {
                    if (hashMap.size() < this.b) {
                        kswVar = new ksw();
                        String I = ((rtz) ((ktc) obj).b.b()).I(z);
                        if (TextUtils.isEmpty(I)) {
                            String string2 = ((ktc) obj).g.getString(R.string.conversation_empty_name);
                            spannableString2 = new SpannableString(string2);
                            spannableString2.setSpan(new StyleSpan(2), 0, string2.length(), 18);
                        } else {
                            spannableString2 = new SpannableString(I);
                        }
                        kswVar.d(spannableString2);
                        kswVar.c(z);
                        hashMap.put(z, kswVar);
                    } else {
                        continue;
                    }
                } else {
                    kswVar = (ksw) hashMap.get(z);
                }
                ((rxc) ((ktc) obj).d.b()).b(a, true);
                String am = a.am();
                if (TextUtils.isEmpty(am)) {
                    String ag = a.ag();
                    String string3 = ((ktc) obj).g.getString(R.string.message_empty_name);
                    spannableString = new SpannableString(string3);
                    spannableString.setSpan(new StyleSpan(2), 0, string3.length(), 18);
                    if (ag != null) {
                        int aQ = yyb.aQ(ag) - 2;
                        if (aQ != 1) {
                            if (aQ != 2) {
                                if (aQ != 3) {
                                    if (aQ != 5) {
                                        string = ((ktc) obj).g.getString(R.string.message_type_other);
                                    } else {
                                        string = ((ktc) obj).g.getString(R.string.message_type_vcard);
                                    }
                                } else {
                                    string = ((ktc) obj).g.getString(R.string.message_type_video);
                                }
                            } else {
                                string = ((ktc) obj).g.getString(R.string.message_type_image);
                            }
                        } else {
                            string = ((ktc) obj).g.getString(R.string.message_type_text);
                        }
                        spannableString = new SpannableString(string);
                        spannableString.setSpan(new StyleSpan(2), 0, string.length(), 18);
                    }
                } else {
                    spannableString = new SpannableString(am);
                }
                long n = a.n();
                MessageIdType B = a.B();
                if (B != null) {
                    kswVar.b(new ksx(spannableString, n, B));
                } else {
                    throw new NullPointerException("Null messageId");
                }
            } catch (Throwable th) {
                try {
                    sxtVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        sxtVar.close();
        Stream map = Collection.EL.stream(hashMap.values()).map(new koa(9));
        int i5 = alog.d;
        return (alog) map.collect(alls.a);
    }
}
