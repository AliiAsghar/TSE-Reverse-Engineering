package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class thz implements agne {
    private final /* synthetic */ int a;

    @Override // defpackage.agne
    public final void a(int i, agnw agnwVar) {
        int i2 = 0;
        switch (this.a) {
            case 0:
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = tid.a;
                valueOf.getClass();
                if (i != 45000) {
                    return;
                }
                tid.a(agnwVar);
                return;
            case 1:
                Integer valueOf2 = Integer.valueOf(i);
                String[] strArr2 = thu.a;
                valueOf2.getClass();
                if (i != 45000) {
                    return;
                }
                thu.b(agnwVar);
                return;
            case 2:
                Integer valueOf3 = Integer.valueOf(i);
                String[] strArr3 = tip.a;
                valueOf3.getClass();
                switch (i) {
                    case 60040:
                        tip.b(agnwVar, 60040);
                        return;
                    case 60110:
                        agnwVar.z("ALTER TABLE restore_workflow_executions ADD COLUMN initial_messages_version INTEGER;");
                        return;
                    case 60220:
                        agnwVar.z("ALTER TABLE restore_workflow_executions ADD COLUMN status_timestamp INTEGER;");
                        return;
                    case 60330:
                        agnwVar.z("ALTER TABLE restore_workflow_executions ADD COLUMN last_attachment_request_timestamp INTEGER;");
                        return;
                    default:
                        return;
                }
            case 3:
                Integer valueOf4 = Integer.valueOf(i);
                String[] strArr4 = tiy.a;
                valueOf4.getClass();
                if (i != 60040) {
                    return;
                }
                tiy.a(agnwVar);
                return;
            case 4:
                Integer valueOf5 = Integer.valueOf(i);
                String[] strArr5 = tji.a;
                valueOf5.getClass();
                if (i != 60420) {
                    return;
                }
                tji.a(agnwVar);
                return;
            case 5:
                Integer valueOf6 = Integer.valueOf(i);
                String[] strArr6 = tjr.a;
                valueOf6.getClass();
                if (i != 60420) {
                    return;
                }
                tjr.a(agnwVar);
                return;
            case 6:
                Integer valueOf7 = Integer.valueOf(i);
                String[] strArr7 = tjz.a;
                valueOf7.getClass();
                if (i != 60420) {
                    return;
                }
                tjz.a(agnwVar);
                return;
            case 7:
                Integer valueOf8 = Integer.valueOf(i);
                String[] strArr8 = tkf.a;
                valueOf8.getClass();
                if (i != 59950) {
                    return;
                }
                tkf.a(agnwVar, 59950);
                return;
            case 8:
                Integer valueOf9 = Integer.valueOf(i);
                String[] strArr9 = tkf.a;
                valueOf9.getClass();
                if (i != 59960) {
                    return;
                }
                agnc.E(agnwVar, "satellite_emergency_details");
                return;
            case 9:
                Integer valueOf10 = Integer.valueOf(i);
                String[] strArr10 = tkr.a;
                valueOf10.getClass();
                if (i != 29050) {
                    if (i != 29080) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE self_participants ADD COLUMN smsc TEXT;");
                    return;
                }
                tkr.c(agnwVar, 29050);
                return;
            case 10:
                Integer valueOf11 = Integer.valueOf(i);
                String[] strArr11 = tky.a;
                valueOf11.getClass();
                if (i != 59920) {
                    if (i != 60400) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE self_profiles ADD COLUMN is_self_profile_shareable INT DEFAULT(1);");
                    return;
                }
                tky.b(agnwVar, 59920);
                return;
            case 11:
                Integer valueOf12 = Integer.valueOf(i);
                String[] strArr12 = tky.a;
                valueOf12.getClass();
                if (i != 60140) {
                    return;
                }
                agnc.F(agnwVar, "self_profiles", tky.a(60140, "TEMP___self_profiles"), tky.a, tky.c());
                return;
            case 12:
                Integer valueOf13 = Integer.valueOf(i);
                String[] strArr13 = tlj.a;
                valueOf13.getClass();
                if (i != 41000) {
                    return;
                }
                tlj.a(agnwVar);
                return;
            case 13:
                Integer valueOf14 = Integer.valueOf(i);
                String[] strArr14 = tmh.a;
                valueOf14.getClass();
                if (i == 13010) {
                    StringBuilder sb = new StringBuilder();
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("sticker_set_id TEXT");
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("locale TEXT");
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("display_name TEXT");
                    sb.insert(0, "CREATE TABLE sticker_sets_localization (");
                    sb.append(", FOREIGN KEY (sticker_set_id) REFERENCES sticker_sets (sticker_set_id) ON DELETE CASCADE PRIMARY KEY (sticker_set_id,locale));");
                    agnwVar.z(sb.toString());
                    String[] at = d.at();
                    int length = at.length;
                    while (i2 < length) {
                        agnwVar.z(at[i2]);
                        i2++;
                    }
                    return;
                }
                return;
            case 14:
                Integer valueOf15 = Integer.valueOf(i);
                String[] strArr15 = tmo.a;
                valueOf15.getClass();
                if (i == 5000) {
                    StringBuilder sb2 = new StringBuilder();
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("sticker_set_id TEXT");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("local_version INT DEFAULT(-1)");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("download_state INT DEFAULT(4)");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("icon_uri TEXT");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("display_name TEXT");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("preview_image_uri TEXT");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("requested_timestamp INT DEFAULT(-1)");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("display_order INT DEFAULT(0)");
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("author TEXT");
                    sb2.insert(0, "CREATE TABLE sticker_sets (");
                    sb2.append(", UNIQUE(sticker_set_id) ON CONFLICT FAIL);");
                    agnwVar.z(sb2.toString());
                    String[] at2 = d.at();
                    int length2 = at2.length;
                    while (i2 < length2) {
                        agnwVar.z(at2[i2]);
                        i2++;
                    }
                    return;
                }
                return;
            case 15:
                Integer valueOf16 = Integer.valueOf(i);
                String[] strArr16 = tmv.a;
                valueOf16.getClass();
                if (i == 13010) {
                    StringBuilder sb3 = new StringBuilder();
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append("sticker_set_id TEXT");
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append("sticker_id TEXT");
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append("locale TEXT");
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append("display_name TEXT");
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append("sticker_local_id INTEGER");
                    sb3.insert(0, "CREATE TABLE stickers_localization (");
                    sb3.append(", FOREIGN KEY (sticker_set_id) REFERENCES sticker_sets (sticker_set_id) ON DELETE SET DEFAULT FOREIGN KEY (sticker_local_id) REFERENCES sticker_sets (_id) ON DELETE CASCADE PRIMARY KEY (sticker_set_id,sticker_id,locale));");
                    agnwVar.z(sb3.toString());
                    String[] at3 = d.at();
                    int length3 = at3.length;
                    while (i2 < length3) {
                        agnwVar.z(at3[i2]);
                        i2++;
                    }
                    return;
                }
                return;
            case 16:
                Integer valueOf17 = Integer.valueOf(i);
                String[] strArr17 = tnc.a;
                valueOf17.getClass();
                if (i == 5000) {
                    StringBuilder sb4 = new StringBuilder();
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append("sticker_set_id TEXT");
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append("sticker_id TEXT");
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append("icon_uri_static TEXT");
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append("icon_uri_animated TEXT");
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append("display_name TEXT");
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append("display_order INT DEFAULT(0)");
                    sb4.insert(0, "CREATE TABLE stickers (");
                    sb4.append(", FOREIGN KEY (sticker_set_id) REFERENCES sticker_sets (sticker_set_id) ON DELETE CASCADE);");
                    agnwVar.z(sb4.toString());
                    String[] at4 = d.at();
                    int length4 = at4.length;
                    while (i2 < length4) {
                        agnwVar.z(at4[i2]);
                        i2++;
                    }
                    return;
                }
                return;
            case 17:
                Integer valueOf18 = Integer.valueOf(i);
                String[] strArr18 = tnl.a;
                valueOf18.getClass();
                if (i != 53020) {
                    return;
                }
                tnl.b(agnwVar);
                return;
            case 18:
                Integer valueOf19 = Integer.valueOf(i);
                String[] strArr19 = tnt.a;
                valueOf19.getClass();
                if (i != 58220) {
                    return;
                }
                tnt.a(agnwVar);
                return;
            case 19:
                Integer valueOf20 = Integer.valueOf(i);
                String[] strArr20 = tom.a;
                valueOf20.getClass();
                if (i != 10014) {
                    return;
                }
                tom.c(agnwVar);
                return;
            default:
                Integer valueOf21 = Integer.valueOf(i);
                String[] strArr21 = tom.a;
                valueOf21.getClass();
                if (i != 57030) {
                    return;
                }
                agnc.F(agnwVar, "user_references", tom.a("TEMP___user_references"), tom.a, tom.b());
                return;
        }
    }
}
