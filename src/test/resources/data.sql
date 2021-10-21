-- 테스트용 임시 저장 DB를 만드는 것이다.
-- hibernates의 시퀀스에 현재 id값을 알려줌
call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (1, 'devlos0', 'devlos@gmail.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (2, 'devlos2', 'devlos2@gmail.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (3, 'devlos3', 'devlos3@gmail.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (4, 'devlos4', 'devlos4@gmail.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (5, 'devlos5', 'devlos5@gmail.com', now(), now());