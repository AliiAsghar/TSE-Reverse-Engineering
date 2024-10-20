package defpackage;

import android.net.wifi.ScanResult;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyv implements Comparator {
    private final /* synthetic */ int a;

    public zyv(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return arrj.q(aaya.c((ResolvedRecipient) obj), aaya.c((ResolvedRecipient) obj2));
            case 1:
                return arrj.q(((ResolvedRecipient) obj).s(), ((ResolvedRecipient) obj2).s());
            case 2:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 3:
                return Long.compare(((apwe) obj).c, ((apwe) obj2).c);
            case 4:
                return arrj.q(Double.valueOf(((afjo) obj2).b), Double.valueOf(((afjo) obj).b));
            case 5:
                return arrj.q(Integer.valueOf(((aflq) obj).ordinal()), Integer.valueOf(((aflq) obj2).ordinal()));
            case 6:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 7:
                return Long.compare(((ahkv) ((atal) obj).b).a, ((ahkv) ((atal) obj2).b).a);
            case 8:
                return 0;
            case 9:
                return (int) (((ahqv) obj).c - ((ahqv) obj2).c);
            case 10:
                long j = ahwx.a;
                return ((ScanResult) obj2).level - ((ScanResult) obj).level;
            case 11:
                int i = aiap.a;
                aibi aibiVar = ((aias) obj).a;
                aibiVar.getClass();
                aibi aibiVar2 = ((aias) obj2).a;
                aibiVar2.getClass();
                aiaj aiajVar = aibiVar.a;
                aiajVar.getClass();
                aiaj aiajVar2 = aibiVar2.a;
                aiajVar2.getClass();
                return aiajVar.compareTo(aiajVar2);
            case 12:
                alzj a = alzj.a(obj);
                alzj a2 = alzj.a(obj2);
                if (a == a2) {
                    int ordinal = a.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    return ((Double) obj).compareTo((Double) obj2);
                                }
                                throw null;
                            }
                            return ((Long) obj).compareTo((Long) obj2);
                        }
                        return ((String) obj).compareTo((String) obj2);
                    }
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                return a.compareTo(a2);
            case 13:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 14:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == null) {
                    if (str2 == null) {
                        return 0;
                    }
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
