package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvb extends gie {
    public final /* synthetic */ WorkDatabase_Impl a;

    public gvb(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
    }

    @Override // defpackage.gie
    public final gif a(gkd gkdVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new gjr("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new gjr("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new gjs("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new gjs("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new gjt("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new gjt("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        gju gjuVar = new gju("Dependency", hashMap, hashSet, hashSet2);
        gju a = gju.a(gkdVar, "Dependency");
        if (!gvf.bu(gjuVar, a)) {
            return new gif(false, a.cd(a, gjuVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap2 = new HashMap(32);
        hashMap2.put("id", new gjr("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new gjr("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new gjr("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new gjr("input_merger_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input", new gjr("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new gjr("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new gjr("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new gjr("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new gjr("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new gjr("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new gjr("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new gjr("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new gjr("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        hashMap2.put("minimum_retention_duration", new gjr("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new gjr("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new gjr("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new gjr("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new gjr("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new gjr("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("next_schedule_time_override", new gjr("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        hashMap2.put("next_schedule_time_override_generation", new gjr("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("stop_reason", new gjr("stop_reason", "INTEGER", true, 0, "-256", 1));
        hashMap2.put("trace_tag", new gjr("trace_tag", "TEXT", false, 0, null, 1));
        hashMap2.put("required_network_type", new gjr("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_request", new gjr("required_network_request", "BLOB", true, 0, "x''", 1));
        hashMap2.put("requires_charging", new gjr("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new gjr("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new gjr("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new gjr("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new gjr("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new gjr("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new gjr("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new gjt("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new gjt("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        gju gjuVar2 = new gju("WorkSpec", hashMap2, hashSet3, hashSet4);
        gju a2 = gju.a(gkdVar, "WorkSpec");
        if (!gvf.bu(gjuVar2, a2)) {
            return new gif(false, a.cd(a2, gjuVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new gjr("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new gjr("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new gjs("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new gjt("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        gju gjuVar3 = new gju("WorkTag", hashMap3, hashSet5, hashSet6);
        gju a3 = gju.a(gkdVar, "WorkTag");
        if (!gvf.bu(gjuVar3, a3)) {
            return new gif(false, a.cd(a3, gjuVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new gjr("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new gjr("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new gjr("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new gjs("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        gju gjuVar4 = new gju("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        gju a4 = gju.a(gkdVar, "SystemIdInfo");
        if (!gvf.bu(gjuVar4, a4)) {
            return new gif(false, a.cd(a4, gjuVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new gjr("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new gjr("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new gjs("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new gjt("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        gju gjuVar5 = new gju("WorkName", hashMap5, hashSet8, hashSet9);
        gju a5 = gju.a(gkdVar, "WorkName");
        if (!gvf.bu(gjuVar5, a5)) {
            return new gif(false, a.cd(a5, gjuVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new gjr("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new gjr("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new gjs("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        gju gjuVar6 = new gju("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        gju a6 = gju.a(gkdVar, "WorkProgress");
        if (!gvf.bu(gjuVar6, a6)) {
            return new gif(false, a.cd(a6, gjuVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new gjr("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new gjr("long_value", "INTEGER", false, 0, null, 1));
        gju gjuVar7 = new gju("Preference", hashMap7, new HashSet(0), new HashSet(0));
        gju a7 = gju.a(gkdVar, "Preference");
        if (!gvf.bu(gjuVar7, a7)) {
            return new gif(false, a.cd(a7, gjuVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n"));
        }
        return new gif(true, null);
    }

    @Override // defpackage.gie
    public final void b(gkd gkdVar) {
        gkdVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gkdVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        gkdVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        gkdVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        gkdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        gkdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        gkdVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gkdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        gkdVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gkdVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gkdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        gkdVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gkdVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        gkdVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gkdVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }
}
