package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdl {
    public static final Pattern a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    public static final Pattern b = Pattern.compile("^(TikTokWorker#|tiktok_).*");

    public static alpt a(Set set) {
        to toVar = new to(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                toVar.add(str.substring(13));
            }
        }
        return alpt.o(toVar);
    }

    public static String b(String str) {
        return "TikTokWorker#".concat(str);
    }

    public static String c(WorkerParameters workerParameters) {
        return (String) alzz.aP(a(workerParameters.c));
    }
}
