package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class uxi {
    public uxi() {
    }

    public static String a(msh mshVar) {
        mshVar.getClass();
        String o = mshVar.o(true);
        if (o == null) {
            return "";
        }
        return o;
    }

    public static Map b(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((Uri) entry.getKey()).getSchemeSpecificPart(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static int c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return R.drawable.four_participants_unknown_avatar;
                }
                return R.drawable.three_participant_unknown_avatar;
            }
            return R.drawable.two_participants_unknown_avatar;
        }
        return R.drawable.unknown_avatar;
    }

    public static Object d() {
        return true;
    }

    public static Object e() {
        return true;
    }

    public static long f(Optional optional) {
        if (optional.isEmpty()) {
            return -1L;
        }
        return ((Instant) optional.get()).toEpochMilli();
    }

    public static Optional g(long j) {
        if (j <= -1) {
            return Optional.empty();
        }
        return Optional.of(Instant.ofEpochMilli(j));
    }

    public static long h(Instant instant) {
        if (instant == null) {
            return 0L;
        }
        return instant.toEpochMilli();
    }

    public static Instant i(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Milliseconds passed cannot be negative.");
        if (j == 0) {
            return Instant.EPOCH;
        }
        return Instant.ofEpochMilli(j).truncatedTo(ChronoUnit.DAYS);
    }

    public static ConversationIdType j(rtz rtzVar, xhv xhvVar) {
        return rtzVar.o(wym.a, xhvVar);
    }

    public static /* synthetic */ String k(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "FORWARD_SYNC";
            }
            return "INCOMING_ENCRYPTED_RCS_MESSAGE";
        }
        return "UNKNOWN";
    }

    public static agmh[] l() {
        return rnm.c.E;
    }

    public uxi(char[] cArr) {
    }
}
