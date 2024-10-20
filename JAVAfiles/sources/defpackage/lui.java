package defpackage;

import android.net.Uri;
import android.os.BaseBundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lui implements BiConsumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lui(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        zqm zqmVar;
        int i = 2;
        int i2 = 6;
        switch (this.b) {
            case 0:
                ((BaseBundle) this.a).putString((String) obj, (String) obj2);
                return;
            case 1:
                ((ixd) this.a).Q(null, new ilf((MessageIdType) obj, (RepliedToDataAdapter) obj2, i2, null));
                return;
            case 2:
                Long l = (Long) obj2;
                boolean isEmpty = TextUtils.isEmpty((String) obj);
                Object obj3 = this.a;
                if (isEmpty) {
                    int intValue = l.intValue();
                    aozy aozyVar = (aozy) obj3;
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    amig amigVar = (amig) aozyVar.b;
                    amig amigVar2 = amig.a;
                    amigVar.b |= 16;
                    amigVar.g = intValue;
                    return;
                }
                int intValue2 = l.intValue();
                aozy aozyVar2 = (aozy) obj3;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amig amigVar3 = (amig) aozyVar2.b;
                amig amigVar4 = amig.a;
                apao apaoVar = amigVar3.h;
                if (!apaoVar.c()) {
                    amigVar3.h = apag.mutableCopy(apaoVar);
                }
                amigVar3.h.g(intValue2);
                return;
            case 3:
                ((pti) this.a).e((qei) obj, (pto) obj2);
                return;
            case 4:
                ((uhj) ((rwd) this.a).h.b()).k((ConversationIdType) obj, (alog) obj2, new String[0]);
                return;
            case 5:
                this.a.addAll(((xxr) obj2).a());
                return;
            case 6:
                ((aozy) this.a).bH((String) obj, (apws) ((aozy) obj2).s());
                return;
            case 7:
                zqo zqoVar = (zqo) obj;
                zqm zqmVar2 = (zqm) obj2;
                int ordinal = zqmVar2.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            zqmVar = zqm.INACTIVE;
                        } else {
                            throw new IllegalStateException("Unexpected state ".concat(String.valueOf(String.valueOf(zqmVar2))));
                        }
                    } else {
                        zqmVar = zqm.HIGHLIGHTED;
                    }
                    for (zqo zqoVar2 : ((zqu) this.a).p) {
                        if (zqoVar2 != zqoVar) {
                            zqoVar2.b(zqmVar);
                        }
                    }
                    return;
                }
                return;
            case 8:
                StringBuilder sb = (StringBuilder) this.a;
                sb.append("\n\nMsisdn ..[");
                sb.append(((String) obj).substring(Math.max(r7.length() - 2, 0)));
                sb.append("]\nLast registration time millis: ");
                sb.append(((yub) obj2).c);
                sb.append("\nHas RCS token: ");
                sb.append(!r8.d.G());
                sb.append("\nHas C11N token: ");
                sb.append(!r8.e.isEmpty());
                return;
            case 9:
                String str = (String) obj;
                int i3 = acnz.e;
                aozy createBuilder = apie.a.createBuilder();
                for (String str2 : ((apie) obj2).b) {
                    if (adng.a.contains(str)) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = String.valueOf(str2);
                        } else if ("token".equals(str)) {
                            int i4 = ambp.a;
                            str2 = ambn.a.c(str2, StandardCharsets.UTF_8).toString();
                        } else if ("IMSI".equals(str)) {
                            str2 = str2.substring(0, 6);
                        }
                    } else if (str2 == null) {
                        str2 = "null";
                    } else if (str2.isEmpty()) {
                        str2 = "empty";
                    } else {
                        str2 = "set";
                    }
                    createBuilder.bd(str2);
                }
                ((aozy) this.a).bc(str, (apie) createBuilder.s());
                return;
            case 10:
                ((aozy) this.a).bH((String) obj, (apws) ((aozy) obj2).s());
                return;
            case 11:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                if (TextUtils.isEmpty(str4)) {
                    advr.o("Excluding %s header in provisioning request because the value is null or empty", str3);
                    return;
                } else {
                    ((HttpURLConnection) this.a).setRequestProperty(str3, str4);
                    return;
                }
            case 12:
                ((alok) this.a).h((String) obj, admx.d((apic) obj2));
                return;
            case 13:
                String str5 = (String) obj;
                Iterator<E> it = ((apie) obj2).b.iterator();
                while (it.hasNext()) {
                    ((Uri.Builder) this.a).appendQueryParameter(str5, (String) it.next());
                }
                return;
            case 14:
                Map.EL.forEach(DesugarCollections.unmodifiableMap(((apws) obj2).b), new ajrn(this.a, (String) obj, i));
                return;
            default:
                ((alok) this.a).h((String) obj, ((armf) obj2).b());
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.b) {
            case 0:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 1:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 2:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 3:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 4:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 5:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 6:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 7:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 8:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 9:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 10:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 11:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 12:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 13:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 14:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }
}
