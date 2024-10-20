package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sor extends aglo {
    public static final String[] a = {"desktop._id", "desktop.desktop_id", "desktop.last_connection_time", "desktop.last_wakeup_time", "desktop.wakeup_attempts_count", "desktop.fingerprint", "desktop.force_refresh", "desktop.client_info", "desktop.operating_system", "desktop.operating_system_version", "desktop.browser_type", "desktop.encryption_key", "desktop.hmac_key", "desktop.backend_type", "desktop.is_active", "desktop.request_id", "desktop.is_persistent", "desktop.desktop_type", "desktop.pairing_type", "desktop.destination_registration_id", "desktop.gaia_email", "desktop.creation_time"};
    public static final alor b;
    public static final soi c;
    public static final int[] d;

    static {
        alok alokVar = new alok();
        alokVar.h("desktop.operating_system", 22040);
        alokVar.h("desktop.operating_system_version", 22040);
        alokVar.h("desktop.browser_type", 18020);
        alokVar.h("desktop.encryption_key", 21030);
        alokVar.h("desktop.hmac_key", 21030);
        alokVar.h("desktop.backend_type", 41010);
        alokVar.h("desktop.is_active", 58010);
        alokVar.h("desktop.request_id", 58010);
        alokVar.h("desktop.is_persistent", 58010);
        alokVar.h("desktop.desktop_type", 58010);
        alokVar.h("desktop.pairing_type", 58960);
        alokVar.h("desktop.destination_registration_id", 59290);
        alokVar.h("desktop.gaia_email", 59560);
        alokVar.h("desktop.creation_time", 59870);
        b = alokVar.b();
        new alok().b();
        c = new soi();
        d = new int[]{15020, 18020, 20020, 21030, 22040, 41010, 58010, 58960, 59290, 59560, 59870};
    }

    public static final soo a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("desktop._id");
            alobVar.h("desktop.desktop_id");
            alobVar.h("desktop.last_connection_time");
            alobVar.h("desktop.last_wakeup_time");
            alobVar.h("desktop.wakeup_attempts_count");
            alobVar.h("desktop.fingerprint");
            alobVar.h("desktop.force_refresh");
            alobVar.h("desktop.client_info");
            if (valueOf.intValue() >= 22040) {
                alobVar.h("desktop.operating_system");
            }
            if (valueOf.intValue() >= 22040) {
                alobVar.h("desktop.operating_system_version");
            }
            if (valueOf.intValue() >= 18020) {
                alobVar.h("desktop.browser_type");
            }
            if (valueOf.intValue() >= 21030) {
                alobVar.h("desktop.encryption_key");
            }
            if (valueOf.intValue() >= 21030) {
                alobVar.h("desktop.hmac_key");
            }
            if (valueOf.intValue() >= 41010) {
                alobVar.h("desktop.backend_type");
            }
            if (valueOf.intValue() >= 58010) {
                alobVar.h("desktop.is_active");
            }
            if (valueOf.intValue() >= 58010) {
                alobVar.h("desktop.request_id");
            }
            if (valueOf.intValue() >= 58010) {
                alobVar.h("desktop.is_persistent");
            }
            if (valueOf.intValue() >= 58010) {
                alobVar.h("desktop.desktop_type");
            }
            if (valueOf.intValue() >= 58960) {
                alobVar.h("desktop.pairing_type");
            }
            if (valueOf.intValue() >= 59290) {
                alobVar.h("desktop.destination_registration_id");
            }
            if (valueOf.intValue() >= 59560) {
                alobVar.h("desktop.gaia_email");
            }
            if (valueOf.intValue() >= 59870) {
                alobVar.h("desktop.creation_time");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new soo(strArr);
    }

    public static void b(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("desktop_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_connection_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_wakeup_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("wakeup_attempts_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("fingerprint TEXT DEFAULT('') NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("force_refresh INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("client_info BLOB");
        if (i >= 22040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("operating_system TEXT DEFAULT('') NOT NULL");
        }
        if (i >= 22040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("operating_system_version TEXT DEFAULT('') NOT NULL");
        }
        if (i >= 18020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("browser_type INT DEFAULT(0)");
        }
        if (i >= 20020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("needs_unpairing INT DEFAULT(0)");
        }
        if (i >= 21030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_key BLOB");
        }
        if (i >= 21030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("hmac_key BLOB");
        }
        if (i >= 41010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backend_type INT");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_active INT DEFAULT(0)");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("request_id TEXT DEFAULT('')");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_persistent INT DEFAULT(0)");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("desktop_type INT DEFAULT(0)");
        }
        if (i >= 58960) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("pairing_type INT DEFAULT(0)");
        }
        if (i >= 59290) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("destination_registration_id BLOB");
        }
        if (i >= 59560) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("gaia_email TEXT");
        }
        if (i >= 59870) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("creation_time INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE desktop (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
