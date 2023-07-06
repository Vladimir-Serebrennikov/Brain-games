run-dist:
	./build/install/app/bin/app

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain checkstyleTest

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run:
	./gradlew run

test:
	./gradlew test
update-deps:
	./gradlew useLatestVersions


build-run: build run

.PHONY: build